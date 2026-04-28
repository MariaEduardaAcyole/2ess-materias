import java.util.Scanner;

public class ex20 {
    //20. Entrar via teclado com um valor qualquer.
    // Travar a digitação, no sentido de aceitar somente
    // valores positivos. Após a digitação, exibir a tabuada do
    // valor solicitado, no intervalo de um a dez.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num,res;

        System.out.print("num: ");
        num = ler.nextInt();

        while (num <= 0) {
            System.out.print("so positivo: ");
            num = ler.nextInt(); // lê novamente
        }
        for (int i=0; i<10; i++){
            res = i*num;
            System.out.printf("\n%d X %d = %d", num, i, res);
        }
    }
}
