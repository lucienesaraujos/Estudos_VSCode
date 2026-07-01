package exercicios;

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        double soma = 0;
        System.out.println("Digite o valor de n: ");
        numero = scanner.nextInt();

        for (int i = 1, j = 1; i <= numero; i++, j+=2) {
            System.out.print(i + "/" + j + " + " );

            soma += i/j;
        }
        System.out.println("Soma é: " + soma);
    }
}
