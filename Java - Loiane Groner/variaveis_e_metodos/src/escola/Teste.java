package escola;

import java.util.Scanner;

public class Teste {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = sc.nextLine();
        System.out.println("Digite o horario do curso: ");
        String horarioCurso = sc.nextLine();

        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        System.out.println("Digite o departamento do professor: ");
        String departamentoProfessor = sc.nextLine();
        System.out.println("Digite o email do professor: ");
        String emailProfessor = sc.nextLine();


        Curso curso = new Curso();
        curso.setNomeCurso(nomeCurso);
        curso.setHorarioCurso(horarioCurso);

        Professor professor = new Professor();
        professor.setNomeProfessor(nomeProfessor);
        professor.setDepartamento(departamentoProfessor);
        professor.setEmailProfessor(emailProfessor);
        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno: " + (i + 1));
            String nomeAluno = sc.nextLine();
            System.out.println("Digite o matrícula do aluno: ");
            String matriculaAluno = sc.nextLine();

            double notas[] = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a " + (j + 1) + " nota do aluno: ");
                notas[j] = sc.nextDouble();
            }
            sc.nextLine();
            Aluno aluno = new Aluno();
            aluno.setNomeAluno(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);
            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}
