package exercicios;

import java.util.Scanner;

public class Ex032 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int i;
    int multi = 1;
    int fator;

    System.out.println("Digite o fatorial desejado: ");
    
    fator = scanner.nextInt();

    for(i = 1; i <= fator; i++){
        multi *= i; 
    }
    System.out.print("" + fator + "! = " + i + ". = " + multi);

    }
}
