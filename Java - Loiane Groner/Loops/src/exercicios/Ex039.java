package exercicios;

import java.util.Scanner;

public class Ex039 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo = 0;
        int altura;
        int maisAlto = Integer.MIN_VALUE;
        int maisBaixo = Integer.MAX_VALUE;
        int codigoMaisAlto = 0;
        int codigoMaisBaixo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o código do aluno: ");
            codigo = scanner.nextInt();
            System.out.println("Digite a altura do aluno em centimetros: ");
            altura = scanner.nextInt();

            if (altura > maisAlto) {
                maisAlto = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
                codigoMaisBaixo = codigo;
            }


        }
        System.out.println("O aluno mais alto é: " + codigoMaisAlto + " tem: " + maisAlto + "cm");
        System.out.println("O aluno mais baixo é: " + codigoMaisBaixo + " tem: " + maisBaixo + "cm");
    }
}
