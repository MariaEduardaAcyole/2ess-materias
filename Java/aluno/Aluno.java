package aluno;

public class Aluno {
    int id;
    String nome;
    String[] materias;
    String periodo;

    //Construtor padrao
    public Aluno(){
        //não tem parametros
    }

    //Construtor não padrao
    public Aluno(int id, String nome, String[] materias, String periodo) {
        this.id = id; // "this" referencia o atributo da classe, diferenciando do parâmetro com o mesmo nome        this.nome = nome;
        this.materias = materias;
        this.periodo = periodo;
    }
}