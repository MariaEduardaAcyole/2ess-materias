import numpy as np
import matplotlib.pyplot as plt

hub_A = [28,29,30,30,31,29,30,31,32,30]
hub_B = [20,22,25,28,30,35,40,55,70,90]

fig, axes = plt.subplots(1, 2, figsize=(10, 4))

axes[0].hist(hub_A, bins="auto", edgecolor='black')
axes[0].set_title("Hub A")
axes[0].set_xlabel("Tempo")
axes[0].set_ylabel("Frequência")
axes[1].hist(hub_B, bins="auto", edgecolor='black')
axes[1].set_title("Hub B")
axes[1].set_xlabel("Tempo")
axes[1].set_ylabel("Frequência")

plt.tight_layout()
plt.show()

print("Hub A - média:", np.mean(hub_A))
print("Hub A - mediana:", np.median(hub_A))
print("Hub B - média:", np.mean(hub_B))
print("Hub B - mediana:", np.median(hub_B))