import java.util.Scanner;

public class auladeclasses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array para 5 clientes
        Cliente[] clientes = new Cliente[5];

        // Cadastro dos clientes
        for (int i = 0; i < 5; i++) {
            System.out.println("Cliente " + (i + 1)); //output: Cliente 5

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // limpar buffer

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            clientes[i] = new Cliente(id, nome, idade);
            System.out.println();
        }

        // Exibir clientes maiores de 18 anos
        System.out.println("Clientes com mais de 18 anos:");

        for (int i = 0; i < 5; i++) {
            if (clientes[i].idade > 18) {
                System.out.printf("ID: %d | Nome: %s | Idade: %d\n",
                        clientes[i].id,
                        clientes[i].nome,
                        clientes[i].idade);
            }
        }

        sc.close();
    }
}