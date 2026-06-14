package Exercicios;

public class Ex016 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        System.out.println(num1);
        System.out.println(num2);

        while (num3 <= 500) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
