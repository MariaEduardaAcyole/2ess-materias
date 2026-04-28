//package ex35;
//
//import java.util.Scanner;
//
//public class cadprodutos {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Produtos[] produtos = new Produtos[5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Produto " + (i + 1));
//
//            System.out.print("ID: ");
//            int id = sc.nextInt();
//            sc.nextLine();
//
//            System.out.print("Descrição: ");
//            String descricao = sc.nextLine();
//
//            System.out.print("Valor: ");
//            double valor = sc.nextDouble();
//
//            System.out.print("Quantidade: ");
//            int quantidade = sc.nextInt();
//
//            produtos[i] = new Produtos(id, descricao, valor, quantidade);
//        }
//        // Exibir clientes maiores de 18 anos
//        System.out.println("produtos com mais de 10 anos:");
//        for (int i = 0; i < 5; i++) {
//            if (produtos[i].quantidade > 10) {
//                System.out.printf(
//                        "ID: %d | Descrição: %s | Valor: %.2f | Quantidade: %d\n",
//                        produtos[i].id,
//                        produtos[i].descricao,
//                        produtos[i].valor,
//                        produtos[i].quantidade
//                        //%d → inteiro (id, quantidade)
//                        //%s → texto (descrição)
//                        //%.2f → decimal com 2 casas (valor)
//                        //\n → quebra de linha
//                );
//            }
//        }
//        sc.close();
//    }
//}