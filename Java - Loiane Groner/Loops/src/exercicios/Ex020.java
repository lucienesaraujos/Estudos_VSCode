package exercicios;

import java.util.Scanner;

public class Ex020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long num = 1;
        int fator;
        boolean repetir = true;
        String resposta;

        while (repetir) {

            System.out.println("Escolha um fator de 0 a 15: ");
            fator = scanner.nextInt();

            while (fator < 0 || fator > 15) {
                System.out.println("Por favor, escolha um fator entre 0 e 15: ");
                fator = scanner.nextInt();
            }

            for (int j = fator; j > 0; j--) {
                num *= j;
                System.out.println(j);
            }
            System.out.println(num);

            num = 1;

            System.out.println("Deseja realizar outra operação? S / N ");
            resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                repetir = false;
            }
        }
    }
}
