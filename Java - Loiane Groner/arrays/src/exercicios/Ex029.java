package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex029 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10001);
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (int) (Math.random() * 10001);
            vetorC[10 + i] = vetorB[0 + i];
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
        System.out.println("Vetor C: " + Arrays.toString(vetorC));
    }
}
