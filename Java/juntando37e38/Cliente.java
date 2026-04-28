package juntando37e38;
//37. Criar um programa que permita cadastrar Clientes Bancários.
// O programa deve oferecer os seguintes menus:
//1 - Cadastrar Cliente
//2 - Depositar
//3 - Sacar
//4 - Emitir Saldo
//5 - Sair

//38. Vamos evoluir o exercício 37 para termos as seguintes funcionalidades:
//Utilizar Getters & Setters
//Limite da conta para facilitar saques;
//Transferência entre contas;
//Extrato bancário para apresentar todas as movimentações na conta.

public class Cliente {
    public String nome;
    private int id_cliente;
    public double saldo;
    public double limite;
    public String extrato = "";

    public void extrato(String texto){
        extrato += texto + "\n";
    }

    public String extrato(){
        return extrato;
    }

    //1- Cadastrar
    public void cadastrar (String nome, int id_cliente, double limite){
        this.nome = nome;
        this.id_cliente = id_cliente;
        this.limite = limite;
    }

    // GET
    public int getId_cliente(){
        return id_cliente;
    }

    // SET
    public void setId_cliente(int id_cliente){
        this.id_cliente = id_cliente;
    }

    //2 - Depositar
    public void depositar (double valor){
        this.saldo += valor;
    }

    //3 - Sacar
    public void sacar (double valor){
        this.saldo -= valor;
    }

    //4 - Emitir saldo
    public double emitirSaldo (){
        return saldo;
    }
}