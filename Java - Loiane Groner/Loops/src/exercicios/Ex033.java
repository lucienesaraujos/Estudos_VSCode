package exercicios;

import java.util.Scanner;

public class Ex033 {

    public static void main(String[] args) {
        double minima = Double.MAX_VALUE;
        double maxima = Double.MIN_VALUE;
        double media = 0;
        double total = 0;
        double temperatura = 0;
        double lancamentos = 0;
        String resposta;
        boolean finalizar = true;
        
        
        Scanner scanner = new Scanner(System.in);
        
        while (finalizar) { 
            System.out.print("Digite a temperatura: ");
            temperatura = scanner.nextDouble();
            
            if (temperatura > maxima){
                maxima = temperatura;
            } else if (temperatura < minima){
                minima = temperatura;
            }
            
            lancamentos++;
            total += temperatura;

            System.out.print("Desejar lançar outra temperatura: ");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")){
            } else{
                finalizar = false;
            }
        }
        media = total/lancamentos;
        System.out.println("Temperatura máxima: " + maxima);
        System.out.println("Temperatura mínima: " + minima);
        System.out.println("Temperatura média: " + media);
    }
}
