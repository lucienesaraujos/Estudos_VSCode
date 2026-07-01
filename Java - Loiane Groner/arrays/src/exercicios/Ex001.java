package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5};

        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
    }
}
