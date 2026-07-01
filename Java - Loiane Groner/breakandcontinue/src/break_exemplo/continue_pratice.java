package break_exemplo;

import java.util.Scanner;

public class continue_pratice {
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
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
