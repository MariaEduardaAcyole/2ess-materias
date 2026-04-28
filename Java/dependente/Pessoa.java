package dependente;

public class Pessoa {
    public int id;
    public String nome;
    public Dependente dependente;

    Pessoa(){

    }

    Pessoa(int id, String nome, Dependente dep){
        this.id = id;
        this.nome = nome;
        this.dependente = dep;
    }

    public void transformarNomeMaiusculo() {
        this.nome = this.nome.toUpperCase();
    }

    public String exibirIdNome() {
        return (this.id + " - " + this.nome);
    }

    public void mudarNome(String novoNome) {
        this.nome = novoNome;
    }

    public String exibirDependente() {
        return ("Nome: " + this.dependente.nome + " - " + "Idade: " + this.dependente.idade);
    }
}
