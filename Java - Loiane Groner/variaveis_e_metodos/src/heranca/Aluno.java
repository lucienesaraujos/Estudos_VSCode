package heranca;

import java.util.Arrays;
import java.util.Objects;

public class Aluno extends Pessoa {

    private String cursos;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefoneFixo, String telefoneCelular, String cpf, String cursos, double[] notas) {
        super(nome, endereco, telefoneFixo, telefoneCelular, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovacao() {
        return true;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do aluno: ";
        s += this.getEndereco();
        return s;
    }

    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno...");
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString() {
        String s = "\n" + cursos;
        s +=  "\nNotas do aluno: ";
        for(double nota : notas) {
            s += "\n" + nota;
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Aluno: \n" +
                "Curso: " + cursos + "\nnotas = " + Arrays.toString(notas);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(cursos, aluno.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cursos);
    }
}
