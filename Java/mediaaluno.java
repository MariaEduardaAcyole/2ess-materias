import java.util.Locale;
import java.util.Scanner;

public class mediaaluno {
   // 16. Uma escola com cursos em regime semestral,
    // realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
    // MEDIA = (P1 + 2.P2) / 3
    // Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média.
    // Exibir a situação final do aluno (“Aprovado ou Reprovado”),
    // sabendo que a média de aprovação é igual a cinco.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double p1, p2, media;

        System.out.print("p1: ");
        p1 = sc.nextDouble();

        System.out.print("p2: ");
        p2 = sc.nextDouble();

        media = (p1+ 2 * p2) / 3;

        if (media < 5){
            System.out.printf("REPROVADO: %.2f%n", media);
        }
        else{
            System.out.printf("APROVADO: %.2f%n", media);
        }

        sc.close();
    }

}
