import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double a, b, c;


        System.out.print("Digite o primeiro valor: ");
        a = sc.nextDouble();


        System.out.print("Digite o segundo valor: ");
        b = sc.nextDouble();


        System.out.print("Digite o terceiro valor: ");
        c = sc.nextDouble();


        if ( ((a+b) > c) && ((a+c) > b) && ((b+c) > a) )
            if ( (a == b) && (a == c) )
                System.out.print("Triângulo Equilátero!");
            else if ( (a != b) && (a != c) && (b != c) )
                System.out.print("Triângulo Escaleno!");
            else
                System.out.print("Triângulo Isósceles!");
        else
            System.out.print("Não é um triângulo!");


        sc.close();
    }
}
