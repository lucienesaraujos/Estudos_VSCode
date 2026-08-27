package heranca;

public class Teste {
    static void main(String[] args) {

        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua Beta, num 02");
        professor.setEndereco("Rua Gama, num 03");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

        System.out.println("Novo curso lançado, confira o valor >>> " + Constantes.VALOR_CURSO);
        System.out.println("Caso o pagamento seja feito até o dia 10, há o desconto de: " + Constantes.VALOR_DESCONTO_ASSIDUIDADE);

        Aluno aluno2 = new Aluno();
        aluno2.setCursos("Ciências da Computação");
        double[] notas = {10, 9, 6, 7};
        aluno2.setNotas(notas);

        System.out.println(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setCursos("Ciências da Computação");
        double[] notas3 = {10, 9, 6, 7};
        aluno3.setNotas(notas3);

        System.out.println(aluno3.equals(aluno2));


    }
}
