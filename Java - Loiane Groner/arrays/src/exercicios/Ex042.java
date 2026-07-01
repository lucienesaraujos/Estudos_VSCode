package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex042 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList vetorA = new ArrayList<>();
        

        for (int i = 0; i < 50; i++) {
            vetorA[i] = (int) (Math.random() * 1000);
        }

        
        for (int i = 0; i < vetorA.length; i++) {
        
        }

        System.out.println(Arrays.toString(vetorA));

    }
}
