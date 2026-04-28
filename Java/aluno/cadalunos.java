package aluno;

import java.util.Scanner;

public class cadalunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("ex35.Aluno " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            String[] materias = new String[6];

            for (int j = 0; j < 6; j++) {
                System.out.print("Matéria " + (j + 1) + ": ");
                materias[j] = sc.next();
            }

            System.out.print("Período: ");
            String periodo = sc.next();

            alunos[i] = new Aluno(id, nome, materias, periodo);
            System.out.println();
        }

        // Mostrar alunos do período noite
        System.out.println("Alunos do período noite:");

        for (int i = 0; i < 5; i++) {
            if (alunos[i].periodo.equalsIgnoreCase("noite")) {

                System.out.printf("ID: %d | Nome: %s | Período: %s\n",
                        alunos[i].id,
                        alunos[i].nome,
                        alunos[i].periodo
                );
                System.out.print("Matérias: ");
                for (int j = 0; j < 6; j++) {
                    System.out.print(alunos[i].materias[j] + " ");
                }
                System.out.println("\n");
            }
        }

        sc.close();
    }
}