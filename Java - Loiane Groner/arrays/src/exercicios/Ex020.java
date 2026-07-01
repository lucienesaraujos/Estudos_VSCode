package exercicios;

import java.util.Scanner;

public class Ex020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] dolar = {3.2, 3.3, 3.3, 3.6, 3.8, 3.9, 3.8, 3.7, 3.9, 4, 3.2, 3.3, 3.3, 3.6, 3.8, 3.9, 3.8, 3.7, 3.9, 4};
        double[] real = new double[20];

        for (int i = 1; i < dolar.length; i++) {
            real[i] = dolar[i] * i;
            System.out.println("O valor do real no dia " + (i + 1) + " é: " + real[i]);
        }
    }
}
