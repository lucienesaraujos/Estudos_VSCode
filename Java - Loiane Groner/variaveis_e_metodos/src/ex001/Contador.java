package ex001;

public class Contador {

    private static double contador = 10;
    private static double somarContador;
    private static double diminuirContador;
    private static double contadorZerado;

    public Contador() {
    }

    public static double adicionarContador(double num1) {
        somarContador = contador + num1;
        return somarContador;
    }

    public static double subtrairContador(double num1) {
        diminuirContador = contador - num1;
        return diminuirContador;
    }

    public static double zerarContador() {
        contador = 0;
        return contadorZerado;
    }

    public static double getContador() {
        return contador;
    }

    public static void setContador(double contador) {
        Contador.contador = contador;
    }

    public static double getSomarContador() {
        return somarContador;
    }

    public static void setSomarContador(double somarContador) {
        Contador.somarContador = somarContador;
    }

    public static double getDiminuirContador() {
        return diminuirContador;
    }

    public static void setDiminuirContador(double diminuirContador) {
        Contador.diminuirContador = diminuirContador;
    }

    public static double getContadorZerado() {
        return contadorZerado;
    }

    public static void setContadorZerado(double contadorZerado) {
        Contador.contadorZerado = contadorZerado;
    }
}
