package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[50];
        int numero = 0;
        String resposta = "";

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) (Math.random()*10);
        }

        System.out.println("Escolha um número de 0 a 1000: ");
        numero = scanner.nextInt();

        for(int i = 0; i < vetorA.length; i++){
            if (numero == vetorA[i]){
                resposta = "Você escolheu um número premiado!";
            } else {
                resposta = "Não foi dessa vez! Tente novamente";
            }
        }

        System.out.println(resposta);
        System.out.println(Arrays.toString(vetorA));
    }
}
