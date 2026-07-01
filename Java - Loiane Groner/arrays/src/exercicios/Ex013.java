package exercicios;

import java.util.Scanner;

public class Ex013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                contador += vetorA[i];
            }
        }
        System.out.println("A soma do Vetor é: " + contador);
    }

}
