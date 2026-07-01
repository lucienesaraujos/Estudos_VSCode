package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex030 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[20];
        ArrayList vetorB = new ArrayList<>();
        ArrayList vetorC = new ArrayList<>();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10001);
            
            if (vetorA[i] % 2 == 0){
                vetorB.add(vetorA[i]);

            } else {
                vetorC.add(vetorA[i]);
            }
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + vetorB);
        System.out.println("Vetor C: " + vetorC);

    }
}
