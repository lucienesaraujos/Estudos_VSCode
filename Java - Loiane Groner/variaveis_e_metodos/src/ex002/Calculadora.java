package ex002;

public class Calculadora {

    public Calculadora() {
    }

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static double potencia(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public static double fatorial(double numero1) {
        double resultado = 1;
        for (int i = 1; i <= numero1; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double fatorialRecursivo(double numero1) {
        if (numero1 == 0) {
            return 1;
        }

        return numero1 * fatorialRecursivo(numero1 - 1);
    }

    public static double fibonacci(double numero1) {
        if (numero1 < 2) {
            return 1;
        }
       return fibonacci(numero1 - 1) + fibonacci(numero1 - 2);
    }

    public static double somaResursiva(double numero1) {
        if (numero1 == 1) {
            return 1;
        }

        return numero1 + somaResursiva(numero1 - 1);
    }

}

