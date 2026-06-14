package Exercicios;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        
        int num;
        int contador = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha um número: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2 ) {
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo");
        }
    }
}