package exercicios;

import java.util.Scanner;

public class Ex023 {

    // TODO: preciso estudar essa estrutura de validação 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("Não há números primos menores ou iguais a " + num + ".");
            return;
        }

        StringBuilder primos = new StringBuilder();
        int quantidade = 0;

        for (int i = num; i >= 2; i--) {
            if (ehPrimo(i)) {
                quantidade++;
                if (quantidade > 1) {
                    if (i == 2) {
                        primos.append(" e ");
                    } else {
                        primos.append(", ");
                    }
                }
                primos.append(i);
            }
        }

        System.out.println("Números primos abaixo de " + num + ": " + primos);
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
