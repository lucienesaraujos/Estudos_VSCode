package exercicios;

import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {

        int quantNum;
        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int media = 0;
        int soma = 0;
        boolean entrada = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja comparar?");
        quantNum = scanner.nextInt();

        for (int i = 0; i < quantNum; i++) {

            System.out.println("Digite um número entre 0 e 1000: ");
            num = scanner.nextInt();

            while (num < 0 || num > 1000) {
                System.out.println("Por favor, digite um número entre 0 e 1000:");
                num = scanner.nextInt();
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            soma += num;
            media = soma / quantNum;
        }
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Média dos números digitados: " + media);
    }
}
