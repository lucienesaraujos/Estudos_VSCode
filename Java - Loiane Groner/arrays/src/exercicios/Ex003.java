package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12, 13, 14, 15};
        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = Math.pow(vetorA[i], 2);
        }
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
        
    }
}
