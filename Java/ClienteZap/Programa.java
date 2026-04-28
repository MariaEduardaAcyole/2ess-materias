package ClienteZap;

public class Programa {
    public static void main(String[] args) {

        //Usando construtor padrão
        Cliente c1 = new Cliente();
        c1.id = 1;
        c1.nome = "Lucas";
        c1.telefone = "011 98849538589";
        c1.saldo = 100;


        // Usando construtor não padrão
        Cliente c2 = new Cliente(1, "Joseffe", "011 9876647268", 100);


        c1.depositar(200);
        c2.depositar(50);


        c1.sacar(5);
        c2.sacar(200);


        System.out.println(c1.getInformacoesCliente());
        System.out.println(c2.getInformacoesCliente());

    }
}
