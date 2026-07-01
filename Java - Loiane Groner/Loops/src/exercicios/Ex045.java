package exercicios;

import java.util.Scanner;

public class Ex045 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};
        int acertos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a resposta da " + i + "ª questão");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase(gabarito[i - 1])) {
                acertos++;
            }
        }
        System.out.println("Quantidade de acertos: " + acertos);
    }
}
