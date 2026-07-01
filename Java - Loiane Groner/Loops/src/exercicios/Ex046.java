package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        double[] saltos = new double[5];
        double soma = 0;
        double media = 0;

        System.out.println("Digite o nome do atleta: ");
        nome = scanner.next();

        for (int i = 0; i < saltos.length; i++){
            System.out.println("Digite a distância do " + (i + 1) + "º salto: ");
            saltos[i] = scanner.nextDouble();
        }

        Arrays.sort(saltos);

        System.out.println("\nAtleta: " + nome);
        System.out.println("Saltos em ordem decrescente:");
        for (int i = saltos.length - 1; i >= 0; i--) {
            System.out.println(saltos[i]);
        }

        for (int i = 1; i <= 3; i++) {
            soma += saltos[i];
        }

        media = soma / 3;

        System.out.println("O maior salto foi: " + saltos[4]);
        System.out.println("O menor salto foi: " + saltos[0]);
        System.out.println("A média dos 3 saltos intermediários foi: " + media);
        
    }

}
