package alunos;

public class Alunos {
    String nome;
    String matricula;
    String nomeCurso;
    String[]disciplinas = new String[3];
    double[][] notas = new double[3][4];

    void mostrarInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas da disciplina: " + disciplinas[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j] + " ");
            }
            System.out.println();
        }
    }
    double obterMedia(int indice){

        double soma = 0;

        for (int i=0; i<notas[indice].length; i++){
            soma += notas[indice][i];
        }

        double media = soma / 4;

        return media;
    }
    boolean verficarAprovacao (int indice){
        if (obterMedia(indice) >= 7){
            return true;
        }

        return false;
    }
}

