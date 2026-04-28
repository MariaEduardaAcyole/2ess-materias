package Resumao;

import Resumao.Classe;

import java.util.Scanner;

public class Programa {
    //PU-ST-VO-MAIN-String[]-ARGS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Cria um objeto
        Classe objeto = new Classe();

        // Cria um array contendo 3 posições para armazenar objetos
        Classe[] obj = new Classe[3];

        int id = 0;

        objeto.atributoNumero = 1;
        System.out.println(objeto.atributoNumero);

        System.out.printf(objeto.getmetodoSemVoid() + "\n");

        //Menu de opçoes
        while (true) {
            System.out.println("opcao: ");
            //armazenar valor na variavel
            int opcao = sc.nextInt();

            if (opcao == 1) {
                //adiciona oque criou no array de obj
                obj[id] = new Classe(); // cria objeto
                obj[id].getmetodoSemVoid();
                System.out.println("Criado o objeto: " + obj[id].atributoTexto + obj[id].atributoNumero + obj[id].atributoNumeroInteiro);
                // incrementa id para usar na exibição de objetos
                id++;
            }

            else if (opcao == 2) {
                // lista de objetos
                for (int i = 0; i < id; i++) {
                    System.out.println("Lista de objetos: " + "nome:" + obj[i].atributoTexto + " id:" + obj[i].atributoNumero + " saldo:" + obj[i].atributoNumeroInteiro);
                }
                System.out.println("qual a posicao do cliente");
                int id_obj = sc.nextInt();

                System.out.println("qual valor ");
                double valor = sc.nextDouble();

               // obj[id_obj].metodocomVoid(valor);

            } else {
                break;
            }

        }
        sc.close();
    }
}