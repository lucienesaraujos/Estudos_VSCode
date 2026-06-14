package Exercicios;

public class Ex004 {
    public static void main(String[] args) {
        double pop1 = 80000;
        double pop2 = 200000;
        double ano = 0;
        
        while (pop1 < pop2) { 
            pop1 += (pop1 / 100) * 3;
            pop2 += (pop2 / 100) * 1.5;
            ano++;
        }

        System.out.println("População A: " + pop1);
        System.out.println("População B: " + pop2);
        System.out.println("Anos para o pareamento: " + ano);
    }
}
