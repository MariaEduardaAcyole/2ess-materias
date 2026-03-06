import java.util.Scanner;

public class ex22 {
    //22. Exibir a tabuada dos valores de um a vinte,
    // no intervalo de um a dez. Entre as tabuadas,
    // solicitar que o usuário pressione uma tecla.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num,res;
        int c;
        for (c=0; c <= 20; c++) {
            for (int i = 1; i <= 10; i++) {
                res = i * c;
                System.out.printf("\n%d X %d = %d", c, i, res);
            }
            System.out.print("pressione um tecla");
            ler.nextLine();

        }
    }
}
