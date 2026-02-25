import java.util.Scanner;

public class retangulo {
/*    11. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.
 */
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double altura, largura, area;

    System.out.printf("Digite a alktura: ");
    altura = ler.nextDouble();

    System.out.printf("Digite a largura : ");
    largura = ler.nextDouble();

    area = altura*largura;

    if (area > 100){
        System.out.printf("terreno grande %.2f\n", area);
    }
    else {
        System.out.printf("area: %.2f\n ", area);
    }
}

}
