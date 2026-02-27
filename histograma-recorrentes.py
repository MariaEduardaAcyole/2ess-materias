import matplotlib.pyplot as plt
novos = [5,6,7,6,8,5,7,6,5,6,7,8,6,7,5] # maioria curta
recorrentes = [20,22,25,23,21,24,22,23,21,25] # maioria longa
plt.hist(novos, bins="auto", alpha=0.7, label="Novos")
plt.hist(recorrentes, bins="auto", alpha=0.7, label="Recorrentes")
plt.title("Tempo de sessão - Novos vs Recorrentes")
plt.xlabel("Minutos")
plt.ylabel("Frequência")
plt.legend()
plt.show()