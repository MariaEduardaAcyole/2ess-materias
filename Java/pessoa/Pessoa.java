package pessoa;

public class Pessoa {
    public int id;
    public String nome;

    Pessoa(){
    }

    Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
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
}
