package exercicios;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = 1.99;
        double valorCompra;

        System.out.println("Lojas Quase 2 - Tabela de preços"); 
        for (int i = 1, quantidade = 0; i <= 50; i++){
            valorCompra = i * preco;
            quantidade++;
            System.out.println(quantidade + " - R$ " + valorCompra);
        }
    }
}
