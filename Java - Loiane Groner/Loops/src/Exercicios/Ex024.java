package Exercicios;

import java.util.Scanner;

public class Ex024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quant;
        double nota;
        double soma = 0;
        double media;

        System.out.print("Digite quantas notas deseja calcular: ");
        quant = scanner.nextInt();

        for (int i = 1; i <= quant; i++) {
            System.out.print("Digite a nota: ");
            nota = scanner.nextDouble();
            soma += nota;
        }
        media = soma / quant;
        System.out.println("A média das notas é: " + media);
    }
}
