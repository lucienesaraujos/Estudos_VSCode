package exercicios_get_set;

public class Alunos_2 {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[]disciplinas;
    private double[][] notas;

    public Alunos_2() {
        disciplinas = new String[3];
        notas = new double[3][4];
    }
    public Alunos_2(String nome, String matricula, String nomeCurso, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public void mostrarInformacoes() {
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

    public double obterMedia(int indice){

        double soma = 0;

        for (int i=0; i<notas[indice].length; i++){
            soma += notas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

    public  boolean verficarAprovacao (int indice){
        if (obterMedia(indice) >= 7){
            return true;
        }

        return false;
    }

    public void setDisciplina (int posicao, String disciplina){
        this.disciplinas[posicao] = disciplina;
    }

    public void setNotasPos (int posI, int posJ, double nota){
        this.notas[posI][posJ] = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

}
