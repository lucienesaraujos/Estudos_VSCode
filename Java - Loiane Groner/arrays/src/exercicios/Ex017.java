package exercicios;

import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = {36, 20, 30, 40, 35, 36, 47, 38, 39, 20, 31, 35};
        int contadorB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                contadorB++;
            }
            
        }
        System.out.println("A quantidade de elementos maiores que 35 é: " + contadorB);
    }
}
