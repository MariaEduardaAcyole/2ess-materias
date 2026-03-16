import java.util.Scanner;

public class ex19 {
    //19. Entrar com dois valores via teclado,
    // onde o segundo deverá ser maior que o primeiro.
    // Caso contrário solicitar novamente apenas o segundo valor.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num2, num;

        System.out.print("num: ");
        num = ler.nextInt();
        System.out.print("num2: ");
        num2 = ler.nextInt();

        while (num >= num2) {
            System.out.print("so maior: ");
            num2 = ler.nextInt(); // lê novamente
        }
    }

}
