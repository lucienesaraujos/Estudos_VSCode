package exercicios_get_set;

import java.util.Scanner;

public class Teste_Alunos2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        Alunos_2 alunos = new Alunos_2();

        System.out.println("Digite o nome do aluno: ");
        alunos.setNome(scanner.next());

        System.out.println("Digite o nome do curso: ");
        alunos.setNomeCurso(scanner.next());

        System.out.println("Digite o matrícula do alunos: ");
        alunos.setMatricula(scanner.next());

        for (int i = 0; i < alunos.getDisciplinas().length; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª disciplina: ");
            alunos.setDisciplina(i, scanner.next());
        }

        for (int i = 0; i < alunos.getNotas().length; i++) {
            System.out.println("Obtendo notas da disciplina: " + alunos.getDisciplinas()[i]);
            for (int j = 0; j < alunos.getNotas()[i].length; j++) {
                System.out.println("Digite a  " + (j + 1) + "ª nota: ");
                alunos.setNotasPos(i, j, scanner.nextDouble());
            }
        }
        alunos.mostrarInformacoes();

        for (int i = 0; i < alunos.getDisciplinas().length; i++) {
            if (alunos.verficarAprovacao(i)){
                System.out.println("Disciplina " + alunos.getDisciplinas()[i] + " foi  aprovado(a).");
            } else {
                System.out.println("Disciplina " + alunos.getDisciplinas()[i] + " foi  reprovado(a).");
            }
        }
    }
}
