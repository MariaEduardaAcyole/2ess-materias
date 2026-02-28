import java.util.Scanner;
import java.util.Locale;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double peso, altura, imc;

        System.out.print("Digite o seu peso em kg: ");
        peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é %.1f", imc);

        if (imc < 18.5)
            System.out.println(" - Abaixo do peso");
        else if (imc < 25)
            System.out.println(" - Peso normal");
        else if (imc < 30)
            System.out.println(" - Sobrepeso");
        else
            System.out.println(" - Obesidade");

        sc.close();
    }
}