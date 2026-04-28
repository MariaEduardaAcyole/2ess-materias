package Resumao;

public class Classe {
    public String atributoTexto;
    public int atributoNumero;
    public double atributoNumeroInteiro;

    // Preciso receber algo desse metodo? Sim=semvoid Nao=comvoid
    // Metodo Get (Leitura): É um metodo que retorna o valor do atributo
    // Ele deve ter um tipo de retorno compatível com o dado que está sendo lido
    // (como int, String ou double) e obrigatoriamente usa o return
    // Metodo Set (Escrita): É um metodo que atribui (popula) um novo valor ao atributo
    // Geralmente é do tipo void (não retorna valor) e recebe o novo dado como parâmetro

    // Getter para ler o ID
    public int getmetodoSemVoid() {
        return atributoNumero; // Retorna o valor atual
    }
    // Setter para definir o ID
    public void setMedotoComVoid(int valor) {
        this.atributoNumero = atributoNumero; // Atribui o valor recebido ao atributo da classe
    }

}

