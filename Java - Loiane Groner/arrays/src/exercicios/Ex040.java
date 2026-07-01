package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex040 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = {2,4,6,8,10,12,14,16,18,20};
        ArrayList vetorC = new ArrayList<>();

        for (int i = vetorA[0]; i < vetorA.length; i++) {
            for (int j = vetorB[0]; j < vetorA.length; j++){
                if (vetorB[j] == vetorA[i]){
                    vetorC.add(vetorB[j]);
                }
            }
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
        System.out.println("Vetor C: " + vetorC);
    }
}
