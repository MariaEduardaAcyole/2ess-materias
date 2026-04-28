package juntando37e38;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente[] cliente = new Cliente[5];

        String nome;
        int id_cliente, opcao, id = 1;
        double valor;

        while (true) {
            System.out.println("opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("CADASTRAR");
                System.out.println("id: ");
                id_cliente = sc.nextInt();

                System.out.println("nome: ");
                nome = sc.next();

                System.out.println("limite: ");
                double limite = sc.nextDouble();

                cliente[id] = new Cliente(); // cria objeto
                cliente[id].cadastrar(nome, id_cliente, limite);

                System.out.println("Criado o cliente: " + cliente[id].nome + cliente[id].getId_cliente() + cliente[id].saldo);
                id++;

            }
            else if (opcao == 2) {
                System.out.println("Depositar");

                for (int i = 1; i < id; i++) {
                    System.out.println("Lista de cliente: " + "nome:" + cliente[i].nome + " id:" + cliente[i].getId_cliente() + " saldo:" + cliente[i].saldo);
                }

                System.out.println("qual a posicao do cliente");
                id_cliente = sc.nextInt();

                System.out.println("qual valor ");
                valor = sc.nextDouble();

                cliente[id_cliente].depositar(valor);
                cliente[id_cliente].extrato("Depositado: "+valor);

            }

            else if (opcao == 3) {
                System.out.println("Sacar");

                for (int i = 1; i < id; i++) {
                    System.out.println("Lista de cliente: " + "nome:" + cliente[i].nome + " id:" + cliente[i].getId_cliente() + " saldo:" + cliente[i].saldo);
                }

                System.out.println("qual a posicao do cliente");
                id_cliente = sc.nextInt();

                System.out.println("qual valor sacar");
                valor = sc.nextDouble();


                double total = cliente[id_cliente].saldo+cliente[id_cliente].limite;
                System.out.println("total: " + total);

                if (valor > total){
                    //Limite da conta para facilitar saques;
                    System.out.println("sem saldo");
                }
                else {
                cliente[id_cliente].sacar(valor);
                System.out.println("novo saldo: " +cliente[id_cliente].saldo);}
                cliente[id_cliente].extrato("Sacado: " + valor);

            }

            else if (opcao ==4){
                //4 - Emitir Saldo
                System.out.println("Emitir saldo");
                for (int i = 1; i < id; i++){
                    System.out.println("Emitir saldo"+ cliente[i].emitirSaldo());}

            }
            else if (opcao == 5){
            // Transferência entre contas;
                System.out.println("Transferencia entre contas");
                System.out.println("qual o cliente de saida");
                int id_cliente_saida = sc.nextInt();

                System.out.println("qual o valor de transferencia");
                valor= sc.nextInt();

                System.out.println("qual o cliente de destino");
                int id_cliente_entrada = sc.nextInt();

                cliente[id_cliente_saida].sacar(valor);
                cliente[id_cliente_entrada].depositar(valor);

            } else if (opcao == 6) {
                //Extrato bancário para apresentar todas as movimentações na conta.
                System.out.println("EXTRATO");

                System.out.println("qual o cliente do extrato");
                int id_cliente_extrato = sc.nextInt();

                System.out.println(cliente[id_cliente_extrato].extrato);
                System.out.println(cliente[id_cliente_extrato].saldo);
            }
            //5 - Sair
            else {
                break;
            }
            //Utilizar Getters & Setters

        }
    }
}