package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++){
                vetorB[i] = i + j;
            }
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

    }
}
