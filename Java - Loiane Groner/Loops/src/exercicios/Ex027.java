package exercicios;

import java.util.Scanner;

public class Ex027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunos;
        int mediaalunos;
        int turmas;
        boolean mediaTurmas = true;

        System.out.println("Digite a quantidade de turmas:");
        turmas = scanner.nextInt();
        System.out.println("Digite a quantidade de alunos");
        alunos = scanner.nextInt();

        for (int i = 1; i <= 40; i++) {
            if (alunos / turmas > 40) {
                turmas++;
            }
        }
        mediaalunos = alunos / turmas;

        System.out.println("Temos " + alunos + " alunos, em " + turmas + " turmas. A media de alunos por turma é: " + mediaalunos);
    }
}
