package ClienteZap;

public class Cliente {
    public int id;
    public String nome;
    public String telefone;
    public double saldo;


    public Cliente(){

    }

    public Cliente(int id, String nome, String telefone, double saldo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.saldo = saldo;
    }


    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }


    public void sacar(double valor){
        if (this.saldo >= valor)
            this.saldo = this.saldo - valor;
        else
            System.out.println("Saldo insuficiente");
    }


    public String getInformacoesCliente(){
        String info = "Nome: " + this.nome + " - Saldo: R$ " + this.saldo + " - Whatsapp: " + this.telefone;


        return info;
    }
}
