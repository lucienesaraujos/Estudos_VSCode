package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12, 13, 14, 15};
        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * i;
        }
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

        
    }
}
