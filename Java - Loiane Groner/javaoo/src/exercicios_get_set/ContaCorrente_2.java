package exercicios_get_set;

public class ContaCorrente_2 {
    private String agencia;
    private int idConta;
    private double saldo;
    private boolean especial;
    private double limite;
    private double valorDebitado;
    private double deposito;
    private double valorEmConta = saldo + limite;
    private double valorEspecialUsado;
    private double limiteEspecial;
    private double valorASacar;
    private double quantiaASacar;
    private double quantiaADepositar;

    public ContaCorrente_2() {
    }
    public ContaCorrente_2(String agencia, double saldo, int idConta, boolean especial, double limite, double valorDebitado, double deposito, double valorEmConta, double valorEspecialUsado, double limiteEspecial) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.idConta = idConta;
        this.especial = especial;
        this.limite = limite;
        this.valorDebitado = valorDebitado;
        this.deposito = deposito;
        this.valorEmConta = valorEmConta;
        this.valorEspecialUsado = valorEspecialUsado;
        this.limiteEspecial = limiteEspecial;
        this.valorASacar = valorASacar;
        this.quantiaASacar = quantiaASacar;
        this.quantiaADepositar = quantiaADepositar;
    }

    public double realizarSaque() {

        if (valorASacar <= saldo) {
            System.out.println("Saque realizado com sucesso");
            saldo -= valorASacar;
        } else if (valorASacar > saldo) {
            System.out.println("O valor desejado é maior que o valor em conta");
            System.out.println("Deseja usar Cheque Especial?");
            if (valorEspecialUsado <= (saldo +  limiteEspecial)){
                 saldo = (saldo + limiteEspecial) - valorASacar;
                System.out.println("Saque realizado com sucesso");
            } else if (valorEspecialUsado > (saldo +  limiteEspecial)){
                System.out.println("Saque não pode ser realizado");
                saldo = (saldo + limiteEspecial) - valorASacar;
            }
        }
        return saldo;
    }

    public double realizarDeposito(double quantiaADepositar){

        saldo += deposito;
        System.out.println("Seu saldo: " + saldo);
        return saldo;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo: " + saldo);
    }


    public boolean verificarUsoChequeEspecial(){
        return especial;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getValorDebitado() {
        return valorDebitado;
    }

    public void setValorDebitado(double valorDebitado) {
        this.valorDebitado = valorDebitado;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getValorEmConta() {
        return valorEmConta;
    }

    public void setValorEmConta(double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorASacar() {
        return valorASacar;
    }

    public void setValorASacar(double valorASacar) {
        this.valorASacar = valorASacar;
    }

    public double getQuantiaASacar() {
        return quantiaASacar;
    }

    public void setQuantiaASacar(double quantiaASacar) {
        this.quantiaASacar = quantiaASacar;
    }

    public double getQuantiaADepositar() {
        return quantiaADepositar;
    }

    public void setQuantiaADepositar(double quantiaADepositar) {
        this.quantiaADepositar = quantiaADepositar;
    }
}
