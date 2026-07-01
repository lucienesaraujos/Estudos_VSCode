package exercicios;

import java.util.Scanner;

public class Ex023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 101);

            if (vetorA[i] % 2 == 1) {
                break;
            }
            System.out.println(vetorA[i]);
        }
    }
}
