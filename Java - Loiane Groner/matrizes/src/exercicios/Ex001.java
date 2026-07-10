package exercicios;

public class Ex001 {

    public static void main(String[] args) {

        int[][] valores = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int linha = 0;
        int coluna = 0;
        int linha2 = 0;
        int coluna2 = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = (int) (Math.random() * 100);
                System.out.print(valores[i][j] + " - ");
            }
            System.out.println();
        }
        /*
         * // outra maneira de gerar números randômicos
         * int[][] valores = new int[4][4];
         * Random numeroRandom = new Random();
         * for (int i = 0; i < valores.length; i++) {
         * for (int j = 0; j < valores[i].length; j++) {
         * valores[i][j] = numeroRandom.nextInt(100);
         */

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[i][j] > maior) {
                    maior = valores[i][j];
                    linha = i;
                    coluna = j;
                }
                if (valores[i][j] < menor) {
                    menor = valores[i][j];
                    linha2 = i;
                    coluna2 = j;
                }

            }
        }
        System.out.println("Maior número: " + maior + " linha: " + linha + " coluna: " + coluna);
        System.out.println("Menor número: " + menor + " linha: " + linha2 + " coluna: " + coluna2);
    }
}