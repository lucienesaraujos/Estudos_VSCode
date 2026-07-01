package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {11, 22, 33, 44, 55, 66, 77, 88};
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

    }
}
