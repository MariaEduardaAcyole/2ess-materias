import java.util.Scanner;

public class exFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, t, i;

        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();

        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
        }

        for (i=1; i<=10; i++) {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
        }
    }
}
