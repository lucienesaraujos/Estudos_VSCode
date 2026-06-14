package exercicios;

import java.util.Scanner;

public class Ex013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Digite o número base: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o número expoente: ");
        num2 = scanner.nextInt();

        int resultado = num1;

        for (int i = 1; i < num2; i++) {
            resultado *= num1;
        }
        System.out.println(resultado);
    }
}
