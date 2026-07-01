package exercicios;

import java.util.Scanner;

public class Ex032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = vetorA[0]; i <= vetorA.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
