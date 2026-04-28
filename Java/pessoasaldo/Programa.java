package pessoasaldo;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Pessoa a = new Pessoa();
        a.id = 1;
        a.nome = "Joseffe";
        a.saldo = 10;

        Pessoa b = new Pessoa(2, "André", 100);

        Pessoa c = new Pessoa();
        c.id = 3;
        c.nome = "Paulo";
        c.saldo = 5;

        int realDolar;

        System.out.printf("Deseja exibir o saldo em:");
        System.out.printf("\n1 - Real");
        System.out.printf("\n2 - Dólar");
        System.out.printf("\nDigite sua opção: ");
        realDolar = ler.nextInt();

        while(realDolar > 2) {
            System.out.printf("Erro! Opção inválida, escolha apenas as opções abaixo:");
            System.out.printf("\n1 - Real");
            System.out.printf("\n2 - Dólar");
            System.out.printf("\nDigite sua opção: ");
            realDolar = ler.nextInt();
        }

        if (realDolar == 1) {
            System.out.printf(a.nome + "- R$ " + a.saldo + "\n");
        }
        else {
            System.out.printf(a.nome + "- US$ " + a.saldo / 4.70 + "\n");
        }

        System.out.printf(a.exibirNomeSaldo(realDolar) + "\n");
        System.out.printf(b.exibirNomeSaldo(realDolar) + "\n");
        System.out.printf(c.exibirNomeSaldo(realDolar) + "\n");
        a.depositar(100);
        b.depositar(100);
        c.depositar(100);
        System.out.printf(a.exibirNomeSaldo(realDolar) + "\n");
        System.out.printf(b.exibirNomeSaldo(realDolar) + "\n");
        System.out.printf(c.exibirNomeSaldo(realDolar) + "\n");

        ler.close();
    }
}
