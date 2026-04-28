package ex39;
//39. Sistema de Controle de Estoque de Loja:
// Neste exercício, em vez de contas bancárias,
// você gerenciará Produtos. Cada produto terá um nome, um
// código identificador, um preço e a quantidade atual em estoque.
//
//Menu de Funcionalidades:
//
//1. Cadastrar Produto: Criar um novo objeto da classe Produto e armazená-lo em uma lista (Array).
//
//2. Entrada de Estoque: Localizar um produto pelo código e somar uma quantidade ao estoque atual (equivalente ao Depositar).
//
//3. Saída de Estoque (Venda): Localizar um produto e subtrair uma quantidade, verificando se há estoque suficiente (equivalente ao Sacar).
//
//4. Consultar Produto/Relatório: Exibir os detalhes de um produto específico ou listar todos os produtos e seus respectivos valores totais em estoque.
//
//5. Sair.

public class Produto {
    public int cod;
    public String nome;
    public double preco;
    public double quantidade;

    public Produto(int cod, String nome, double preco, double quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void estoque (double quantidade){
        this.quantidade += quantidade;
    }
    public void venda (double quantidade){
        this.quantidade -= quantidade;
    }

}
