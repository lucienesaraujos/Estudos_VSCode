package exercicios;

public class Ex003 {
    public static void main(String[] args) {

        int[][] valores = new int[4][4];

        int contador0 = 0;
        int contador1 = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = (int) (Math.random() * 100);
                System.out.print(valores[i][j] + " - ");
            }
            System.out.println();
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[i][j] % 2 == 0) {
                    contador0++;
                } else {
                    contador1++;
                }

            }
        }
        System.out.println("Quantidade de números pares: " + contador0);
        System.out.println("Quantidade de números ímpares: " + contador1);
    }
}
