package alunos;


import java.util.Scanner;

public class TesteAlunos {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        Alunos aluno = new Alunos();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.next();

        System.out.println("Digite o nome do curso: ");
        aluno.nomeCurso = scanner.next();

        System.out.println("Digite o matrícula do aluno: ");
        aluno.matricula = scanner.next();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª disciplina: ");
            aluno.disciplinas[i] = scanner.next();
        }

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Obtendo notas da disciplina: " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.println("Digite a  " + (j + 1) + "ª nota: ");
                aluno.notas[i][j] = scanner.nextDouble();
            }
        }
        aluno.mostrarInformacoes();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if (aluno.verficarAprovacao(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " foi  aprovado(a).");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " foi  reprovado(a).");
            }
        }
    }
}
