import java.util.Scanner;
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);

        sc.close();
    }
