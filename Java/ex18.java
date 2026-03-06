import java.util.Scanner;

public class ex18 {
    //18. Criar uma rotina de entrada que aceite somente um valor positivo.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.print("num: ");
        num = ler.nextInt();

        while (num <= 0) {
            System.out.print("so positivo: ");
            num = ler.nextInt(); // lê novamente

        }
    }
}