package exercicios;

import java.util.Scanner;

public class Ex025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quant;
        int idade;
        int media;
        int soma = 0;
        // TODO: CONTINUE ASSIM! TESTE TODO
        System.out.print("Digite quantos alunos tem a turma: ");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            soma += idade;
        }
        media = soma / quant;

        if (media <= 25) {
            /* FIXME: a IDE indica a melhoria do código com a substituição do texto escrito*/

            System.out.println("Média de idade da turma: " + media + ". Essa turma é jovem");
        } else if (media <= 60) {
            System.out.println("Média de idade da turma: " + media + ". Essa turma é adulta");
        } else {
            System.out.println("Média de idade da turma: " + media + ". Essa turma é idosa");
        }
    }
}
