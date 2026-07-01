package exercicios;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int colecao;
        double valorUnitario;
        double valorTotal = 0;
        double valorMedio;

        System.out.print("Quantos CDs tem a sua coleção? ");
        colecao = scanner.nextInt();

        for (int i = 1; i <= colecao; i++) {
            System.out.print("Digite o valor do CD: ");
            valorUnitario = scanner.nextDouble();
            valorTotal += valorUnitario;
        }
        valorMedio = valorTotal / colecao;

        System.out.println("Sua coleção tem " + colecao + " CD, o valor total dela é: " + valorTotal + " e o valor médio de cada CD é: " + valorMedio);
    }
}
