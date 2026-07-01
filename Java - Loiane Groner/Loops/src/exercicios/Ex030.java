package exercicios;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = 0.18;
        double valorCompra;

        System.out.println("Preço do pão: R$ 0.18"); 
        System.out.println("Panificadora Pão de Ontem - Tabela de preços"); 
        for (int i = 1, quantidade = 0; i <= 50; i++){
            valorCompra = i * preco;
            quantidade++;
            System.out.println(quantidade + " - R$ " + valorCompra);
        }
    }
}

