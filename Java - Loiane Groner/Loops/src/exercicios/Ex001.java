package exercicios;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {

        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota de 0 a 10: ");

            Scanner scanner = new Scanner(System.in);

            int nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Digite um valor válido");
            } else {
                notaValida = true;
                System.out.println("Você deu nota: " + nota + "!");
            }
        } while (!notaValida);
    }
}
