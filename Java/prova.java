import java.util.Scanner; // serve para receber interação do teclado

public class prova {
        public static void main(String[] args) {//cuidado para não escrever main com maiuscula

            Scanner sc = new Scanner(System.in);
            //sc.nextInt(); //le numeros inteiros
            //sc.nextDouble(); // le numeros com virgula
            System.out.printf(""); // formatar o texto com variáveis

            int a, b, t, i;
            a = 0;
            if (a >= 5) {
                System.out.printf("Valor: %d maior", a);
            }
            else {
                System.out.printf("Valor: %d menor", a);
            }

            //while(){//Checa a condição antes de entrar no loop

            //}
            //do while: Executa pelo menos uma vez antes de checar a condição

            //for: quando você sabe exatamente quantas vezes quer repetir

            //incrementar a variável (ex: i++)



            for(i = 1; i <= 5; i++) {
                t = 2 * i;
                System.out.println(t);
            }
            sc.close(); // tem que fechar o Scanner

        }
}
