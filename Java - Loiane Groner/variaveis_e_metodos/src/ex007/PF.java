package ex007;

public class PF extends Contribuinte {

    public void calcularImposto(double renda) {
        double aliquota;
        double deduzir;
        if (renda >= 0 && renda <= 1400) {
            System.out.println("Aliquota de 0%");
            System.out.println("Contribuinte isento de Imposto de Renda");
        } else if (renda > 1400 && renda <= 2100) {
            System.out.println("Aliquota de 10%");
            aliquota = 0.1;
            deduzir = 100;
            double valor = renda * aliquota;
            System.out.println("Valor do Imposto a ser recolhido: " + ((renda*aliquota) - deduzir));
        } else if (renda > 2100 && renda <= 2800) {
            System.out.println("Aliquota de 15%");
            aliquota = 0.15;
            deduzir = 270;
            double valor = renda * aliquota;
           System.out.println("Valor do Imposto a ser recolhido: " + ((renda*aliquota) - deduzir));
        } else if (renda > 2800 && renda <= 3600) {
            System.out.println("Aliquota de 25%");
            aliquota = 0.25;
            deduzir = 500;
            double valor = renda * aliquota;
            System.out.println("Valor do Imposto a ser recolhido: " + ((renda*aliquota) - deduzir));
        } else if (renda > 3600) {
            System.out.println("Aliquota de 30%");
            aliquota = 0.3;
            deduzir = 700;
            double valor = renda * aliquota;
           System.out.println("Valor do Imposto a ser recolhido: " + ((renda*aliquota) - deduzir));
        }
    }

    public String toString() {
        return "\nDeclaração de Imposto de renda\nContribuinte: " + this.getNome() + "\nRenda declarada: " + this.getRenda();
    }
}
