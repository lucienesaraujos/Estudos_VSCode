package exercicios;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contador = 0;
        int soma = 0;
        int media = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 1) {
                contador++;
                soma += vetorA[i];
                
            }
        }
        media = soma/contador;
        System.out.println("A media do Vetor é: " + media);


        
    }
}
