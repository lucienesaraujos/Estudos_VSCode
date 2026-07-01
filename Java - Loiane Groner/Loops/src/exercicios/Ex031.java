package exercicios;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        int produto = 0;
        double valor;
        double valorTotal = 0;
        double recebido;
        double troco;
        int quantidade;

        System.out.println("Lojas Tabajara");
        do { 
            System.out.print("Produto " + (produto+1) +": ");
            valor = scanner.nextDouble();
            produto++;
            valorTotal += valor;
            } while (valor != 0);
        
        System.out.println("Total: " + valorTotal);
        System.out.print("Digite o valor recebido do cliente: ");
        recebido = scanner.nextDouble();
        troco = recebido - valorTotal;
        System.out.println("Troco: " + troco);
    }
}
