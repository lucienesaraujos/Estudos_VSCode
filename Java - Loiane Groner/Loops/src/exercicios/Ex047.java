package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nota = new double[7];
        String nome = "";
        double media = 0;
        double soma = 0;

        System.out.println("Digite o nome do atleta: " );
        nome = scanner.next();

        for (int i = 0; i < nota.length; i++){
            System.out.println("Digite a nota: ");
            nota[i] = scanner.nextDouble();
        }

        Arrays.sort(nota);

        System.out.println("Atleta: " + nome);
        System.out.println("Notas recebidas: ");
        for (int i = nota.length - 1; i >= 0; i--) {
            System.out.println(nota[i]);
        }

        for (int i = 1; i <= 5; i++){
            soma += nota[i];
        }
        media = soma / 5;
        System.out.println("A maior nota foi: " + nota[6]);
        System.out.println("A menor nota foi: " + nota[0]);
        System.out.println("A média das 5 notas intermediárias foi: " + media);
    }
}
