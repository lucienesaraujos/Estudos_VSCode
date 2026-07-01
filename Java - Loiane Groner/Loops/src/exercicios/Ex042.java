package exercicios;

import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        boolean fim = true;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        
        while (fim) {
            System.out.print("Digite um número entre 0 e 100: ");
            numero = scanner.nextInt();

            if (numero >= 0 && numero <= 25) {
                contador1++;
            } else if (numero >= 26 && numero <= 50) {
                contador2++;
            } else if (numero >= 51 && numero <= 75) {
                contador3++;
            } else if (numero >= 76 && numero <= 100) {
                contador4++;
            } else if (numero < 0) {
                fim = false;
            }
        }
        System.out.println("Você digitou " + contador1 + " número entre 0 - 25");
        System.out.println("Você digitou " + contador2 + " número entre 25 - 50");
        System.out.println("Você digitou " + contador3 + " número entre 51 - 75");
        System.out.println("Você digitou " + contador4 + " número entre 76 - 100");
    }
}
