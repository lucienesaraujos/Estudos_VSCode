package exercicios;

import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] vetorB = new int[8];
        int contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
                contador++;
            }
        }
        System.out.println("O Vetor tem " + contador + " números pares");
    }

}
