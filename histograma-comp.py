import matplotlib.pyplot as plt
ios = [110,115,118,120,121,125,130,135,140,145]
android = [200,220,240,260,300,420]
plt.hist(ios, bins="auto", alpha=0.7, label="iOS" , edgecolor="gray")
plt.hist(android, bins="auto", alpha=0.7, label="Android")
plt.title("Latência por plataforma")
plt.xlabel("ms")
plt.ylabel("Frequência")
plt.legend()
plt.show()