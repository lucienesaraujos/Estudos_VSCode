package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1,  2,  3,  4,  5,  6,  7,  8, 9, 10};
        int[] vetorB = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.println("Vetor C: " + Arrays.toString(vetorC));

        
    }
}
