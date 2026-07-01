package exercicios;

import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas1 = {6.2, 7.5, 10, 9.5, 8.1, 4.5, 5.5, 9.1, 4.6, 6};
        double[] notas2 = {9.2, 4.5, 7, 6.5, 4.1, 3.5, 7.5, 8.1, 9.6, 8};
        double[] resultado = new double[10];
        double[] soma = new double[10];
        double[] media = new double[10];
        int matricula = 0;
        String status = "";

        for (int i = 0; i < resultado.length; i++) {
            soma[i] = notas1[i] + notas2[i];
            matricula = i;
            media[i] = soma[i] / 2;
            if (media[i] >= 7) {
                status = "Aprovado!";
            } else {
                status = "Reprovado!";
            }
            System.out.println("Aluno matricula: " + (i + 1) + ". 1ª nota: " + notas1[i] + ", 2ª nota: " + notas2[i] + ". Total: " + soma[i] + ". A média é: " + media[i] + "\n" + status);
        }
    }
}
