package matriz_exemplo;

import java.util.Scanner;

public class Irregular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entrevistadas = 0;
        int filhos = 0;
        
        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        entrevistadas = scanner.nextInt();

        String [][] nomesFilhos = new String[entrevistadas][];

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Quantos filhos a entrevistada tem? ");
            filhos = scanner.nextInt();

            nomesFilhos[i] = new String[filhos];

            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do(a) " + (j+1) + " filho(a): ");
                nomesFilhos[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("A entrevistada número " + (i + 1) + " tem " + nomesFilhos[i].length + " filho(s)");
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println((i+1) + ": " + nomesFilhos[i][j]);
            }
        }

        }

}
