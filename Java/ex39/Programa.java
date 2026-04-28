package ex39;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[20];
        int opcao, cod;
        int totalProdutos = 0;
        String nome;
        double preco, quantidade;
        int cod_auxiliar = -1;


        while(true){
            System.out.println("=== Menu Java Banking ===");
            System.out.println("1. Cadastrar Produto: Criar um novo objeto da classe Produto e armazená-lo em uma lista (Array)");
            System.out.println("2. Entrada de Estoque: Localizar um produto pelo código e somar uma quantidade ao estoque atual (equivalente ao Depositar).\n");
            System.out.println("3. Saída de Estoque (Venda): Localizar um produto e subtrair uma quantidade, verificando se há estoque suficiente (equivalente ao Sacar");
            System.out.println("4. Consultar Produto/Relatório: Exibir os detalhes de um produto específico ou listar todos os produtos e seus respectivos valores totais em estoque.\n");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.print("Digite o cod: ");
                cod = sc.nextInt();

                System.out.print("Digite o nome: ");
                nome = sc.next();

                System.out.print("Digite o preço do produto: ");
                preco = sc.nextDouble();

                System.out.print("Digite a quantidade do produto: ");
                quantidade = sc.nextDouble();

                Produto p = new Produto(cod, nome, preco, quantidade);


                produtos[totalProdutos] = p;
                totalProdutos++;

                System.out.println("Produto cadastrado com sucesso!");
            }
            else if (opcao == 2){
                System.out.println("2. Entrada de Estoque: Localizar um produto pelo código e somar uma quantidade ao estoque atual (equivalente ao Depositar).\n");
                System.out.println("Lista de produtos: ");

                for (int i=0; i<totalProdutos; i++) {
                    System.out.println("cod: " + produtos[i].cod + "| nome: " + produtos[i].nome + " | quantidade: " + produtos[i].quantidade );
                        cod_auxiliar = i;
                }

                System.out.println("Qual cod (ID):");
                cod = sc.nextInt();

                System.out.println("Depositar: ");
                quantidade = sc.nextDouble();

                produtos[cod_auxiliar].estoque(quantidade);
                System.out.println("estoque atualizado: " + produtos[cod_auxiliar].quantidade);

            }
            else if (opcao == 3){
                System.out.println("3. Saída de Estoque (Venda): Localizar um produto e subtrair uma quantidade, verificando se há estoque suficiente (equivalente ao Sacar");
                System.out.println("Lista de produtos: ");

                for (int i=0; i<totalProdutos; i++) {
                    System.out.println("cod: " + produtos[i].cod + "| nome: " + produtos[i].nome + " | quantidade: " + produtos[i].quantidade );
                    cod_auxiliar = i;
                }

                System.out.println("Qual cod (ID):");
                cod = sc.nextInt();

                System.out.println("Vender: ");
                quantidade = sc.nextDouble();

                produtos[cod_auxiliar].venda(quantidade);
                System.out.println("venda atualizado: " + produtos[cod_auxiliar].quantidade);
            } else if (opcao == 4) {
                System.out.println("//4. Consultar Produto/Relatório: Exibir os detalhes de um produto específico ou listar todos os produtos e seus respectivos valores totais em estoque.\n");
                for (int i=0; i<totalProdutos; i++) {
                    System.out.println("MOSTRA TODOS \n cod: " + produtos[i].cod + "| nome: " + produtos[i].nome + " | quantidade: " + produtos[i].quantidade );
                    cod_auxiliar = i;

                    System.out.println("Qual cod (ID):");
                    cod = sc.nextInt();
                    System.out.println("Consultar \n cod: " + produtos[i].cod + "| nome: " + produtos[i].nome + " | quantidade: " + produtos[i].quantidade );
                    cod_auxiliar = i;
                }
            } else{
                break;
            }
        }


        sc.close();
    }
}
