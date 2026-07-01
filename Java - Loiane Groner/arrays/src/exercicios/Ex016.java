package exercicios;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] vetorA = {1, 20, 30, 4, 5, 6, 7, 8, 9, 10, 11, 15};
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int media = 0;
        int soma = 0;


        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                contadorA += vetorA[i];
            } else if (vetorA[i] == 15) {
                contadorB++;
            } else {
                contadorC++;
                soma += vetorA[i];
            }
        }
        media = soma / contadorC;
        System.out.println("A soma dos elementos menores que 15 é: " + contadorA);
        System.out.println("A quantidade de elementos iguais a 15 é: " + contadorB);
        System.out.println("A media dos elementos maiores que 15 é: " + media);




        
    }
}
