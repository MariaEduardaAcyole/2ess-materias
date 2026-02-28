import java.util.Locale;
import java.util.Scanner;

public class velocidade {

//15. Criar um programa para analisar a velocidade de um automóvel.
// Solicitar via teclado os valores da aceleração (a em m/s2),
// velocidade inicial (v0 em m/s) e o tempo de percurso (t em s).
// Calcular e exibir a velocidade final do automóvel em km/h.
//E exibir mensagem de acordo com a tabela abaixo:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double aceleracao, velocidadeInicial, tempoPercurso, velocidade;

        System.out.print("aceleracao: ");
        aceleracao = sc.nextDouble();

        System.out.print("velocidade inicial: ");
        velocidadeInicial = sc.nextDouble();

        System.out.print("tempo do percurso: ");
        tempoPercurso = sc.nextDouble();

        //Fórmula para o cálculo da velocidade em m/s: V = v0 + a. t
        velocidade = velocidadeInicial + aceleracao * tempoPercurso;

        System.out.print("Velocidade: "+velocidade+ "\n");

        if (velocidade <= 40){
            System.out.print("Veiculo muito lento");
        } else if ( 40 < velocidade && velocidade <= 60) {
            System.out.print("Veiculo muito lento");
        } else if ( 60 < velocidade && velocidade <= 80) {
            System.out.print("Veiculo muito lento");
        }
        else if ( 80 < velocidade && velocidade <= 120) {
            System.out.print("Veiculo rapido");
        }
        else{
            System.out.print("veiculo muito rapido");
        }

        sc.close();

    }
}
