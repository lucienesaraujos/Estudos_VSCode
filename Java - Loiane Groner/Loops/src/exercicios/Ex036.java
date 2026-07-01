package exercicios;

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicando;;
        int primeiroMultiplicador;
        int ultimoMultiplicador;
        int produto;

        System.out.print("Qual tabuada seja montar: ");
        multiplicando = scanner.nextInt();
        System.out.print("Deseja começar por qual número? ");
        primeiroMultiplicador = scanner.nextInt();
        System.out.print("Deseja terminar em qual número? ");
        ultimoMultiplicador = scanner.nextInt();
        
        while (primeiroMultiplicador > ultimoMultiplicador){
            System.out.println("O último multiplicador não pode ser menor que o primeiro número escolhido");
            System.out.print("Deseja terminar em qual número? ");
            ultimoMultiplicador = scanner.nextInt();
        }
        System.out.println("*******************");
        System.out.println("Montar a tabuada de: " + multiplicando);
        System.out.println("Começar por: " + primeiroMultiplicador);
        System.out.println("Terminar em: " + ultimoMultiplicador);
        System.out.println("*******************");
        System.out.println("Vou montar a tabuada de " +multiplicando+ " comecando em " +primeiroMultiplicador+ " e terminando em " +ultimoMultiplicador+ ":");
        for ( int i = primeiroMultiplicador; i <= ultimoMultiplicador; i++){
            produto = i * multiplicando; 
            System.out.println(multiplicando + " X " + i + " = " + produto);
        }
    }
}
