package exercicios;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {36, 20, 30, 40, 35, 36, 47, 38, 39, 20, 31, 35};
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE; //vetorA[0] - uma boa prática é usar o index 0
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > maior) {
                maior = vetorA[i];
                p1 = i;
            }
            if (vetorA[i] < menor) {
                menor = vetorA[i];
                p2 = i;
            }
        }
        System.out.println("A pessoa mais velha tem: " + maior + ". Sua posição na fila é: " + (p1 + 1));
        System.out.println("A pessoa mais nova tem: " + menor + ". Sua posição na fila é: " + (p2 + 1));
    }
}

