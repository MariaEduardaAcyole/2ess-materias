import java.util.Scanner;
//29. Entrar via teclado com “N” valores quaisquer. O valor “N”
// (que representa a quantidade de números) será digitado, deverá ser positivo,
// mas menor que vinte. Caso a quantidade não satisfaça a restrição,
// enviar mensagem de erro e solicitar o valor novamente.
// Após a digitação dos “N” valores, exibir:
//a) O maior valor;
//b) O menor valor;
//c) A soma dos valores;
//d) A média aritmética dos valores;
//e) A porcentagem de valores que são positivos;
//f) A porcentagem de valores negativos;
//
//Após exibir os dados, perguntar ao usuário se deseja ou não uma nova
// execução do programa. Consistir a resposta no sentido de aceitar somente
// “S” ou “N” e encerrar o programa em função dessa resposta.

public class ex29 {
    public static void main(String[] args) { //PSVM
        Scanner sc = new Scanner(System.in);

        int n, num, maior = 0, menor = 0, soma = 0, qtd_pos = 0, qtd_neg = 0;
        double media, por_neg, por_pos;


        System.out.print("digite o qtd de numeros que serao digitados");
        n = sc.nextInt();

        String res = "S";

        while (res.equalsIgnoreCase("S")) {
            while (n < 1 || n > 19) {
                System.out.print("erro a quantidade de numeros deve ser enter 1 e 19");
                System.out.print("digite o qtd de numeros que serao digitados");
                n = sc.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                System.out.printf("digite o %n numero", i);
                num = sc.nextInt();

                if (num >= 0) {
                    qtd_pos++;
                } else {
                    qtd_neg++;
                }
                if (i == 1) {
                    maior = num;
                    menor = num;
                } else if (num > maior) {
                    maior = num;
                } else if (num < menor) {
                    menor = num;
                }
                soma += num;
            }

            media = (double) soma / n;

            por_neg = (qtd_neg * 100 / n);
            por_pos = (qtd_pos * 100) / n;

            System.out.println("Soma " + soma);
            System.out.println("media " + media);
            System.out.println("maior " + maior);
            System.out.println("menor " + menor);
            System.out.printf("porcento positivo %.1f%%\n", por_pos);
            System.out.printf("porcento negativo %.1f%%\n", por_neg);

        do {
            System.out.println("Deseja continuar?");
            res = sc.next();
        } while (!res.equalsIgnoreCase("S") && !res.equalsIgnoreCase("N"));
    }
        sc.close();
    }
}
