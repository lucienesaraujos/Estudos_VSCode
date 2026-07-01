package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[13];
        char[] vetorB = new char[13];

        for (int i = 0; i < vetorB.length; i++) {
            vetorA[i] = (int) (Math.random() * 20);
            if (vetorA[i] < 7) {
                vetorB[i] = 'A';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'B';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'C';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'D';
            } else {
                vetorB[i] = 'E';
            }
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
    }
}
