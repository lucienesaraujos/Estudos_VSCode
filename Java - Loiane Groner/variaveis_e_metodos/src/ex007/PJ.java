package ex007;

public class PJ extends Contribuinte{

    public void calcularImposto(double renda) {
        double aliquota = 0.1;
        System.out.println("Aliquota de 10%");
        double valor = renda * aliquota;
       System.out.println("Valor do imposto: " + valor);
    }

    public String toString() {
        return "\nDeclaração de Imposto de renda\nContribuinte: " + this.getNome() + "\nRenda declarada: " + this.getRenda();
    }
}
