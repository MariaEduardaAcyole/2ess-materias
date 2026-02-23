import java.util.Scanner;

public class exemplo {
    static void main() {
       //'psvm' é o atalho para criar essa função
        System.out.print("hello World!");

        //instancio = crio o objeto Scanner para ler a digitação do usuario
        Scanner sc = new Scanner(System.in);

        // declaração de variavel
        int a, b, soma;

        //solicita ao usuario os numeros
        System.out.print("primeioro numero: ");
        a = sc.nextInt();
        System.out.print("segundo numero: ");
        b = sc.nextInt();

        //realizo operação
        soma = a+b;

        //exibo resultado
        System.out.print("soma = "+soma);
        sc.close();
    }
}
