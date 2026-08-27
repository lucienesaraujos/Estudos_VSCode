package ex006;

public class contaEspecial extends Cliente{

    private double limite = 500;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double sacarDinheiro(double valorSacar){
        double saldoComLimite = this.getSaldo() + limite;
        if ((saldoComLimite - valorSacar) >= 0) {
           this.setSaldo(this.getSaldo() - valorSacar);
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return this.getSaldo();
    }
}
