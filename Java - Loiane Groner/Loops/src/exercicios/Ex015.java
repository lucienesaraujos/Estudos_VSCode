package exercicios;

import java.util.Scanner;

public class Ex015 {

    public static void main(String[] args) {

        int fator;
        int num1 = 1;
        int num2 = 1;
        int num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o fator Fibonacci: ");
        fator = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 3; i <= fator; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
