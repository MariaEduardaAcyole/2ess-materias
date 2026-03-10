import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0;
        for (int c=1; c <= 100; c++) {
            soma += c;
        }
        System.out.print("soma "+ soma);

    }
}