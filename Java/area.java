import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definindo as variáveis
        int ladoA, ladoB, areaTriangulo, areaQuadrado;

        // Solicitando dados ao usuário
        System.out.print("Digite o valor do lado A: ");
        ladoA = sc.nextInt();
        System.out.print("Digite o valor do lado B: ");
        ladoB = sc.nextInt();

        areaTriangulo = (ladoA * ladoB) / 2;

        // Exibindo resultado do triângulo
        System.out.printf("Área do triângulo: %d%n", areaTriangulo);

        // Fórmula: área = lado * lado
        areaQuadrado = ladoA * ladoA;

        // Exibindo resultado do quadrado
        System.out.printf("Área do quadrado: %d%n", areaQuadrado);

        sc.close();
    }
}
