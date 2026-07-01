package exercicios;

import java.util.Scanner;

public class Ex034 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetorA = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 20);

            for (int k = vetorA[0]; k < vetorA.length; k++) {
                System.out.print(vetorA[i] + ": ");
                for (int j = 2; j < vetorA[i]; j++) {
                    if (j % 2 == 0){
                    System.out.print("" + j + ", ");
                    }
                }
            }
        }
    }
}
