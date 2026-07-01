package exercicios;

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 20);

            for (int k = vetorA[i]; k < vetorA.length; k++) {
                System.out.println(vetorA[i] + ": ");
                for (int j = 1; j <= vetorA[i]; j++) {
                    if (vetorA[i] % j == 0){
                    System.out.println(j + " é divisor");
                    }
                }
            }
        }
    }
}