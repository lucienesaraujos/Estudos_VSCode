package exercicios;

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        int fator;
        int num = 1;

        System.out.print("Digite o número a ser fatorado: ");
        fator = scanner.nextInt();
        
        System.out.println("Fatorial de: " + fator);
        System.out.print(fator + "! = ");

        for (int i = fator; i > 1; i--) {
            num *= i;
            System.out.print(i + " . ");
        }

        System.out.print("1 = " + num + "\n");
    }
}