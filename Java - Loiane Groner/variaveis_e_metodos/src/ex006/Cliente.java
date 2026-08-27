package ex006;

public class Cliente {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public double sacarDinheiro(double valorSacar){
        if ((saldo- valorSacar) >= 0) {
            saldo -= valorSacar;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public void depositarDinheiro(double valorDeposito){
        saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCliente + "\nNúmero da Conta: " + numConta +
                "\nSaldo: " + saldo;
    }
}
