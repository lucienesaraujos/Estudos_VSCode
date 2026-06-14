package exercicios;

import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {

        int num;
        int contador = 0;
        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        num = scanner.nextInt();
        // TODO: Armazena os divisores encontrados em uma única string
        StringBuilder divisores = new StringBuilder();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
                if (divisores.length() > 0) {
                    divisores.append(", ");
                }
                divisores.append(i);
            }
        }
        if (contador == 2) {
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo, por ser divisível por " + contador + " divisores diferentes, são eles: " + divisores);
        }
    }
}
