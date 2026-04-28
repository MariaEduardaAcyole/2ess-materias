import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String res = "S";

        while (res.equalsIgnoreCase("S")) {

            int fat = 1; // reinicia a cada execução

            System.out.print("Digite o valor: ");
            n = sc.nextInt();

            // validação (não pode ser negativo)
            while (n < 0) {
                System.out.print("Erro! Digite um valor não negativo: ");
                n = sc.nextInt();
            }

            // cálculo do fatorial
            for (int i = n; i > 1; i--) {
                fat *= i;
            }

            System.out.println("Fatorial: " + fat);

            // perguntar se deseja continuar
            do {
                System.out.print("Deseja continuar? (S/N): ");
                res = sc.next();
            } while (!res.equalsIgnoreCase("S") && !res.equalsIgnoreCase("N"));
        }

        System.out.println("Programa encerrado.");
        sc.close();

        //31. Crie um programa em que o usuário entre com um número inteiro qualquer, e o programa imprima os 20 números subsequentes ao que foi digitado pelo usuário
        //
        //32. Crie um programa que solicite que o usuário entre com dois números (inicial e final). Ao final o programa deverá apresentar o valor total da soma de todos os números do intervalo digitado pelo usuário
        //
        //33. Elabore um programa que apresente os números pares maiores que 10 no intervalo fechado [A, B]. Sendo que A e B serão números inteiros escolhidos pelo usuário. Um número é par quando este satisfaz a seguinte condição: (NÚMERO mod 2 = 0)
    }
}