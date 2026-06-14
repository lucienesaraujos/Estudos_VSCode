package Exercicios;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a população do 1º país: ");
        double pop1 = scanner.nextDouble();

        System.out.println("Digite a taxa de crescimento do 1º país: ");
        double taxaPop1 = scanner.nextDouble();

        System.out.println("Digite a população do 2º país: ");
        double pop2 = scanner.nextDouble();

        System.out.println("Digite a taxa de descrecimo do 2º país: ");
        double taxaPop2 = scanner.nextDouble();

        int ano = 0;

        if (pop1 < pop2) {
            while (pop1 < pop2) {
                pop1 += (pop1 / 100) * taxaPop1;
                pop2 += (pop2 / 100) * taxaPop2;
                ano++;
            }
        }

        if (pop1 > pop2) {
            while (pop1 > pop2) {
                pop1 += (pop1 / 100) * taxaPop1;
                pop2 += (pop2 / 100) * taxaPop2;
                ano++;
            }
        }

        System.out.println("População A: " + pop1);
        System.out.println("População B: " + pop2);
        System.out.println("Anos para o pareamento: " + ano);
    }
}
