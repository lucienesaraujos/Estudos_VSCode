package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10001);
            int original = vetorA[i];
            int copia = vetorA[i];
            int invertido = 0;

            while (copia != 0) {
                int digito = copia % 10;
                invertido = (invertido * 10) + digito;
                copia = copia / 10;
            }
            vetorB[i] = invertido;
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
    }
}
