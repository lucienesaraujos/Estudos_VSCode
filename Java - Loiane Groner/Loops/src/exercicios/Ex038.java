package exercicios;

import java.text.DecimalFormat;

public class Ex038 {
    public static void main(String[] args) {
        int salario = 1000;
        double ajuste = ((salario/100)*1.5);
        DecimalFormat format = new DecimalFormat ("###,###.##");
        for(int i = 1997; i <= 2026; i++){
            salario += ajuste;
            System.out.println(i + " Salario: " + format.format(salario) + "Ajuste: " + ajuste);
            ajuste *= 2;
        }
    }
}
