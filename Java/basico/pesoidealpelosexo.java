import java.util.Locale;
import java.util.Scanner;

public class pesoidealpelosexo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double peso, altura, imc;
        String sexo;

        System.out.print("Peso: ");
        peso = sc.nextDouble();

        System.out.print("Altura: ");
        altura = sc.nextDouble();

        System.out.print("Sexo (M/F): ");
        sc.nextLine(); // limpa o buffer
        sexo = sc.next();

        imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        // não usar sexo == "m" - nao funciona | o ideal é usar o equals
        if (sexo.equals("M") || sexo.equals("F")) {

            if (imc < 19) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24) {
                System.out.println("Peso ideal");
            } else if (imc < 30) {
                System.out.println("Acima do peso");
            } else {
                System.out.println("Obesidade");
            }

        } else {
            System.out.println("Sexo inválido");
        }

        sc.close();
    }
}