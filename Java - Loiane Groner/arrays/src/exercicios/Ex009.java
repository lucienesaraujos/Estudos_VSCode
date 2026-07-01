package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] vetorA = {1,  2,  3,  4,  5,  6,  7,  8};
        double[] vetorB = {12, 13, 14, 15, 16, 17, 18, 19};
        double[] vetorC = new double[8];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] =  vetorB[i] / vetorA[i];
        }
        System.out.println("Vetor C: " + Arrays.toString(vetorC));


        
    }
}
