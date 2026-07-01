package exercicios;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //programa para números pré-cadastrados
        /*
        int[] vetorA = {121, 656, 100, 659, 753, 159, 852, 456, 955, 323};
        int[] vetorB = new int[10];
        int contador = 0;

        for (int i = 0; i < vetorA.length; i++){
            int original = vetorA[i];
            int copia = vetorA[i];
            int invertido = 0;
            
        while (copia != 0){
                int digito = copia % 10;
                invertido = (invertido * 10) + digito;
                copia = copia / 10;
            }

            vetorB[i] = invertido;


            
            if (original == vetorB[i]){
                contador++;
            }
        }
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
        System.out.println("Temos no array " +contador+ " políndromos");
        */

        //programa para o usuário lançar os valores
        int[] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com um número na posição " + i);
            vetorA[i] = scanner.nextInt();
        }
        boolean palindromo = true;
        for (int i = 0; i < vetorA.length/2; i++){
            if( vetorA[i] != vetorA[vetorA.length -1 -i]){
                palindromo = false;
                break;
            }
        }
        if (palindromo){
            System.out.println("Palindromo");
        }
        
    }
}
