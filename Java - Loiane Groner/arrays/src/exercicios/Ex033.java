package exercicios;

import java.util.Scanner;

public class Ex033 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10001);
        }

        for (int i = 0; i < vetorA.length; i++) {
            int numero = vetorA[i];
            boolean primo = true;

            if (numero < 2) {
                primo = false;
            } else {
                for (int k = 2; k * k <= numero; k++) {
                    if (numero % k == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo){
                System.out.println(numero + " é primo");
            } else {
                System.out.println(numero + " não é primo");
            }
        }
    }
}
