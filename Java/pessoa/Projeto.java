package pessoa;

public class Projeto {

    public static void main(String[] args) {
        // Cria um array contendo 10 posições para armazenar objetos
        Pessoa[] listaPessoas = new Pessoa[10];

        // Instancia (cria) o objeto com o construtor padrão
        Pessoa a = new Pessoa();

        // Popula o objeto (preenche os atributos do objetos)
        a.id = 1;
        a.nome = "João";

        // Adiciona o objeto no array "listaPessoas"
        listaPessoas[0] = a;

// =====================================

        // Instancia (cria) o objeto com o construtor não padrão já populando ele
        Pessoa b = new Pessoa(2, "Maria");

        // Adiciona o objeto no array "listaPessoas"
        listaPessoas[1] = b;

// =====================================

        // Instancia (cria) o objeto com o construtor não padrão já populando ele
        Pessoa c = new Pessoa(3, "José");

        // Adiciona o objeto no array "listaPessoas"
        listaPessoas[2] = c;

// =====================================

        System.out.printf("Pessoa %d criada com sucesso (%s)!", listaPessoas[0].id, listaPessoas[0].nome);
        System.out.printf("\nPessoa %d criada com sucesso (%s)!", listaPessoas[1].id, listaPessoas[1].nome);
        System.out.printf("\nPessoa %d criada com sucesso (%s)!", listaPessoas[2].id, listaPessoas[2].nome);
    }


}
