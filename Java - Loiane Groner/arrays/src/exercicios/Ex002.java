package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1,  2,  3,  4,  5,  6,  7,  8};
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

        
    }
}
