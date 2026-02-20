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
print("DP amostral:", s.std(ddof=1))
