package CPs;

import java.util.Scanner;

public class cp1 {
    public static void main(String[] args) { //PSVM
        Scanner sc = new Scanner(System.in);

        int n, num, maior=0, menor=0, soma=0, qtd_pos=0, qtd_neg=0;
        double media, por_neg, por_pos;

        System.out.print("digite o qtd de numeros que serao digitados");
        n = sc.nextInt();

        while (n<1 || n>19){
           System.out.print("erro a quantidade de numeros deve ser enter 1 e 19");
            System.out.print("digite o qtd de numeros que serao digitados");
            n = sc.nextInt();
        }

        for(int i = 1; i<=n; i++){
         System.out.printf("digite o %n numero", i);
         num = sc.nextInt();

            if(num >= 0){
                qtd_pos++;
            }
            else{
                qtd_neg++;
            }
            if (i == 1){
                maior = num;
                menor = num;
            }
            else if (num > maior){
                maior = num;
            }
            else if(num < menor){
                menor = num;
            }
            soma += num;
        }

        media = (double) soma/n;

        por_neg = (qtd_neg*100/n);
        por_pos = (qtd_pos*100)/n;

        System.out.println("Soma "+ soma);
        System.out.println("media "+ media);
        System.out.println("maior "+ maior);
        System.out.println("menor "+ menor);
        System.out.printf("porcento positivo %.1f%%\n", por_pos);
        System.out.printf("porcento negativo %.1f%%\n", por_neg);

        System.out.println("fim do programa");

sc.close();
        }
}
