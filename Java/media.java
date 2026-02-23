import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definindo as variáveis

        double val1, val2, val3, val4, soma, media;

        System.out.print("Digite o valor 1: ");
        val1 = sc.nextInt();
        System.out.print("Digite o valor 2: ");
        val2 = sc.nextInt();
        System.out.print("Digite o valor 3: ");
        val3 = sc.nextInt();
        System.out.print("Digite o valor 4: ");
        val4 = sc.nextInt();

        soma = val1+val2+val3+val4;
        media = soma/4;
        System.out.printf("media: %.2f", media);

        sc.close();
    }
}

