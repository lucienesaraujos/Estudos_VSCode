package Exercicios;

import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int contador;
        int resultado;

        System.out.println("Digite qual tabuada deseja gerar: ");
        num = scanner.nextInt();

        for (contador = 0; contador < 13; contador++) {
            resultado = num * contador;
            System.out.println(num + " x " + contador + " = " + resultado);
        }
    }
}
