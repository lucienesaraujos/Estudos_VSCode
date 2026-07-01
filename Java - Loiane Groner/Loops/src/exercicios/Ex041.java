package exercicios;

import java.util.Scanner;

public class Ex041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double divida;
        int juros; //{0,10,15,20,25};
        int parcelas = 3; //{1,3,6,9,12};
        double valorDivida;
        double valorParcela;
        double valorJuros;
        int percentualJuros = 10;

        System.out.print("Informe o valor da divída: ");
        divida = scanner.nextDouble();



        System.out.println("Valor da dívida: " + divida);
        System.out.println("Valor dos juros: 0");
        System.out.println("Quantidade de parcelas: 1");
        System.out.println("Valor da parcela: " + divida);
        
        for (int i = 1; i <= 4; i++) {
            

            valorJuros = (divida / 100) * percentualJuros;
            valorDivida = divida + valorJuros;
            valorParcela = valorDivida / parcelas;

            System.out.println("Valor da dívida: " + valorDivida);
            System.out.println("Valor dos juros: " + valorJuros);
            System.out.println("Quantidade de parcelas: " + parcelas);
            System.out.println("Valor da parcela: " + valorParcela);
            
            parcelas += 3;
            percentualJuros += 5;
            
        }
    }
}
