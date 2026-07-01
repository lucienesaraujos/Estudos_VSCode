package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int contador0 = 0;
        int contador1 = 0;
        int percentual0 = 0;
        int percentual1 = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random()*1);

            if (vetorA[i] == 0){
                contador0++;
                percentual0 = (contador0*100)/10;
            }
            if (vetorA[i] == 1){
                contador1++;
                percentual1 = (contador1*100)/10;
            }
        }
        System.out.println("O percentual de 0 no vetor é: " + percentual0);
        System.out.println("O percentual de 1 no vetor é: " + percentual1);
        System.out.println(Arrays.toString(vetorA));
    }
}
