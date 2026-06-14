package Exercicios;

import java.util.Scanner;

public class Ex014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int resultadoPar = 0;
        int resultadoImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            if (num % 2 != 1) {
                resultadoPar++;
            } else {
                resultadoImpar++;
            }
        }
        System.out.println("Quantidade de números pares: " + resultadoPar);
        System.out.println("Quantidade de números ímpares: " + resultadoImpar);
    }
}
