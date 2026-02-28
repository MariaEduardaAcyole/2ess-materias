import java.util.Locale;
import java.util.Scanner;

public class mediaalunoelaborada {
//17. Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e
// calcula a média do aluno, da seguinte maneira:
// MEDIA = (P1 + 2.P2) / 3
// Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e
// o programa deverá calcular e exibir quanto o aluno precisa tirar na segunda
// nota minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double p1, p2, media;

        System.out.print("p1: ");
        p1 = sc.nextDouble();

        p2 = (15 - p1) / 2 ;

        System.out.print("p2: "+ p2);

        sc.close();
    }
}
