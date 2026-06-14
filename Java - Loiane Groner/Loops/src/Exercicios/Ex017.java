package Exercicios;

import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fator;
        int num = 1;

        System.out.println("Digite o número a ser fatorado: ");
        fator = scanner.nextInt();

        for (int i = fator; i > 0; i--) {
            num *= i;
            System.out.println(" " + i);
        }
        System.out.println(" " + num);
    }
}
