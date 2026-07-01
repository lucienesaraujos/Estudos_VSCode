package exercicios;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int contadorI = 0;
        int contadorP = 0;
        int percentualP = 1;
        int percentualI = 1;


        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contadorP++;
                percentualP = (contadorP*100) / vetorA.length;
            } else {
                contadorI++;
                percentualI = (contadorI*100) / vetorA.length;
            }
        }
        System.out.println("A percentagem de números pares é: " + percentualP);
        System.out.println("A percentagem de números ímpares é: " + percentualI);


        
    }
}
