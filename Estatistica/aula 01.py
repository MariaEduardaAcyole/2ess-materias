import statistics as st
lat_ms = [120, 130, 125, 128, 122, 600]

print("--- STATISTICS ---")

media = st.mean(lat_ms)
modas = st.mode(lat_ms)
mediana = st.median(lat_ms)
dp_amostral = st.stdev(lat_ms) # amostral (n-1)
var_amostral = dp_amostral ** 2 # variância amostral

print("Média:", media)
print("Moda(s):", modas)
print("Mediana:", mediana)
print("Variância amostral:", var_amostral)
print("DP amostral:", dp_amostral)

print("--- PANDAS ---")

import pandas as pd
s = pd.Series([120, 130, 125, 128, 122, 600], name="lat_ms")
print("Média:", s.mean())
print("Moda:", s.mode().tolist())
print("Mediana:", s.median())
print("Variância amostral:", s.var(ddof=1))
print("DP amostral:", s.std(ddof=1)) #SIGNIFICA O (n-1) = VARIANCIA AMOSTRAL

print("--- outliers ---")

import pandas as pd
com_outlier = pd.Series([120, 130, 125, 128, 122, 600])
sem_outlier = pd.Series([120, 130, 125, 128, 122])
def resumo(x):
 return {
 "media": x.mean(),
 "mediana": x.median(),
 "var_amostral": x.var(ddof=1),
 "dp_amostral": x.std(ddof=1),
 }
print("Com outlier:", resumo(com_outlier))
print("Sem outlier:", resumo(sem_outlier))

print("--- TAREFAS ---")

print("ATIVIDADE 1")
um = pd.Series([98, 105, 101, 99, 110, 500, 103, 97, 102,108], name="lat_ms")
print("Média:", um.mean())
print("Moda:", um.mode().tolist())
print("Mediana:", um.median())
print("Variância amostral:", um.var(ddof=1))
print("DP amostral:", um.std(ddof=1)) #SIGNIFICA O (n-1) = VARIANCIA AMOSTRAL

print("sla tipico maior que 120ms: ")
if mediana < 120:
    print("ok", mediana)
else:
    print("não okay", mediana)
