package matriz_exemplo;

public class Tridimensional {

    public static void main(String[] args) {
        int[][][] matriz = new int[3][3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = i + j + k;
                    System.out.println("I: " + i + " - J: " + j + " - K: " + k);
                }
            }
        }

        int soma = 0;
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    
                    soma += matriz[i][j][k];

                    if (matriz[i][j][k] % 2 == 0) {
                        pares += matriz[i][j][k];
                    } else {
                        impares += matriz[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total: " + soma);
        System.out.println("Soma dos pares: " + pares);
        System.out.println("Soma impares: " + impares);
    }
}
