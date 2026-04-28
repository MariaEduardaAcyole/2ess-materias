import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int x, a, b, res;

        do {
            System.out.print("Digite um valor positivo para X: ");
            x = ler.nextInt();
        } while (x <= 0);

        // ler A
        System.out.print("Digite o valor de A: ");
        a = ler.nextInt();

        // validar B maior que A
        System.out.print("Digite o valor de B (maior que A): ");
        b = ler.nextInt();

        while (b <= a) {
            System.out.print("B deve ser maior que A. Digite novamente: ");
            b = ler.nextInt();
        }

        // tabuada decrescente de B até A
        for (int i = b; i >= a; i--) {
            res = x * i;
            System.out.printf("%d x %d = %d\n", x, i, res);
        }

        ler.close();
    }
}