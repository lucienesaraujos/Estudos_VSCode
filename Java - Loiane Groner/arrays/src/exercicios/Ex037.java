package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex037 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] vetorB = new int[15];
        int numero1 = 1;
        int numero2 = 1;
        int numero3 = 1;

        for (int i = 0; i < vetorA.length; i++) {
            numero1 = vetorA[i];
            numero2 = numero3;
            numero3 = numero1 * numero2;
            vetorB[i] = numero3;
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
    }
}
