package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex036 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorA = new double[11];
        int base = 2;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.pow(base, i);
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
    }
}
