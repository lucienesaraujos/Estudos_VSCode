package exercicios;

import java.util.Random;

public class Ex002 {
    public static void main(String[] args) {

        int[][] valores = new int[10][10];
        int maiorLinha = Integer.MIN_VALUE;
        int menorLinha = Integer.MAX_VALUE;
        int maiorColuna = Integer.MIN_VALUE;
        int menorColuna = Integer.MAX_VALUE;

        Random numeroRandom = new Random();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = numeroRandom.nextInt(100);
                System.out.print(valores[i][j] + " - ");
            }
            System.out.println();
        }
        for (int i = 0; i < valores[5].length; i++){
            if (valores[5][i] > maiorLinha) {
                    maiorLinha = valores[5][i];
                }
                if (valores[5][i] < menorLinha) {
                    menorLinha = valores[5][i];
                }
            }

        for (int i = 0; i < valores.length; i++) {
                if (valores[i][7] > maiorColuna) {
                    maiorColuna = valores[i][7];
                }
                if (valores[i][7] < menorColuna) {
                    menorColuna = valores[i][7];
                }
            }
            System.out.println("Maior número da Linha 5: " + maiorLinha);
            System.out.println("Menor número da Linha 5: " + menorLinha);
            System.out.println("Maior número da Coluna 7: " + maiorColuna);
            System.out.println("Menor número da Coluna 7: " + menorColuna);
        }
        }
