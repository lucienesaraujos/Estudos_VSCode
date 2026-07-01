package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 101);

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 0;
            } else {
                vetorB[i] = 1;
            }

            //ternário >> vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor A: " + Arrays.toString(vetorB));
    }
}
