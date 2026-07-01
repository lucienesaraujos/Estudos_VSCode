package break_exemplo;

import java.util.Scanner;

public class break_pratice {
    //Programa que procura o primeiro número divisível por 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInicio;
        int numFinal;
        System.out.println("Digite o número inicial: ");
        numInicio = scanner.nextInt();
        System.out.println("Digite o número final: ");
        numFinal = scanner.nextInt();

        for (int i = numInicio; i <= numFinal; i++){
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}
