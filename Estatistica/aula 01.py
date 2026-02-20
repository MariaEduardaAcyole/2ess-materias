import statistics as st
lat_ms = [120, 130, 125, 128, 122, 600]

media = st.mean(lat_ms)
mediana = st.median(lat_ms)
modas = st.mode(lat_ms)
dp_amostral = st.stdev(lat_ms) # amostral (n-1)
var_amostral = dp_amostral ** 2 # variância amostral

print("Média:", media)
print("Mediana:", mediana)
print("Moda(s):", modas)
print("Variância amostral:", var_amostral)
print("DP amostral:", dp_amostral)
