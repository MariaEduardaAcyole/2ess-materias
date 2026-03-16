import java.util.Scanner; // serve para receber interação do teclado

public class pntabuada {
    public static void main (String[] args){
        //Crie um programa que peça um número positivo.
        // Se o usuário digitar algo negativo, o programa deve mostrar erro e pedir novamente (use while).
        // Assim que aceitar, mostre a tabuada desse número de 1 a 10 usando um laço for

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a;
        a = sc.nextInt();

        while (a<=0){
            System.out.print("a: ");
            a = sc.nextInt();
        }
        for (int i = 1 ; i<11; i++){
            int r = i*a;
            System.out.printf("%d x %d = %d \n" , i, a,r);
        }
    }
}
