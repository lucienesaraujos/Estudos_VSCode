package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = (int) (Math.random() * 120);
            vetorB[i] = (int) (Math.random() * 120);

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor A: " + Arrays.toString(vetorB));
        System.out.println("Vetor A: " + Arrays.toString(vetorC));
    }
}
