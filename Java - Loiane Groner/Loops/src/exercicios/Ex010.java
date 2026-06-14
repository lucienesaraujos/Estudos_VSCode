package exercicios;

import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            for (numero1 = numero1; numero1 < numero2; numero1++) {
                System.out.println(numero1);
            }
        }

        if (numero1 > numero2) {
            for (numero2 = numero2; numero1 > numero2; numero2++) {
                System.out.println(numero2);
            }
        }
    }
}
