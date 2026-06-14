package Exercicios;

import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma = 0;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            for (numero1 = numero1; numero1 <= numero2; numero1++) {
                System.out.println(numero1);
                soma += numero1;
            }
            System.out.println(soma);
        } else {
            for (numero2 = numero2; numero1 >= numero2; numero2++) {
                System.out.println(numero2);
                soma += numero2;
            }
            System.out.println(soma);
        }
    }
}
