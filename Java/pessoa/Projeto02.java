package pessoa;

import java.util.Scanner;

public class Projeto02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Cria um array contendo 10 posições para armazenar objetos
        Pessoa[] listaPessoas = new Pessoa[10];

        int id;
        String nome;

        for (int i=0; i<=2; i++) {

            // Popula o objeto (preenche os atributos do objetos)
            System.out.printf("Digite o id da pessoa: ");
            id = ler.nextInt();

            System.out.printf("Digite o nome da pessoa: ");
            nome = ler.next();

            // Instancia (cria) o objeto
            Pessoa p = new Pessoa(id, nome);

            // Adiciona o objeto no array "listaPessoas"
            listaPessoas[i] = p;
        }

        // Mudando o nome de algumas pessoas da lista, utilizando o método "mudarNome"
        listaPessoas[0].mudarNome("Joseffe");
        listaPessoas[2].mudarNome("Jefferson");

        // Atualizando o nome para letras maiúsculas de uma pessoa da lista
        listaPessoas[1].transformarNomeMaiusculo();

        for (int i=0; i<=2; i++) {
            System.out.printf("\nPessoa %d criada com sucesso (%s)!", listaPessoas[i].id, listaPessoas[i].nome);

            // Exibindo os dados utilizando o método "exibirIdNome"
            System.out.printf("\n%s", listaPessoas[i].exibirIdNome());
        }
    }
}
