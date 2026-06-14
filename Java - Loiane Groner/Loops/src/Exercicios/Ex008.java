package Exercicios;

import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        int media = 0;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
            soma += num;
            media = soma / 10;
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("A média dos números digitados foi: " + media);
    }
}
