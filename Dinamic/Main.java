
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[30];
        numeros[30] = 60; // da erro nao tem mais espaço - por ser array estatico
        System.out.print(numeros);
    }
}
