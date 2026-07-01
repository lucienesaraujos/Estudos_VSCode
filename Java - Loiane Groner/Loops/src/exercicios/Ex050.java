package exercicios;

import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        System.out.println("Digite o valor de n: ");
        numero = scanner.nextInt();
        
        System.out.print("H = 1");
        for (int i = 1; i <= numero; i++){
            System.out.print(" + 1/" + (i + 1));
            soma += 1/i;
        }
        System.out.println("\nA soma de H é: " + soma);
    }
}
