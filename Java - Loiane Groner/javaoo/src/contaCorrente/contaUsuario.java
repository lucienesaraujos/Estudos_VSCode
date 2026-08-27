package contaCorrente;

public class contaUsuario {

    String agencia;
    int idConta;
    double saldo;
    boolean especial;
    double limite;
    double valorDebitado;
    double deposito;
    double valorEmConta = saldo + limite;
    double valorEspecialUsado;
    double limiteEspecial;


    boolean realizarSaque(double quantiaASacar) {
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else {
            if (especial) {
                limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta é: " + saldo);
    }

    boolean verficarUsoChequeEspecial(){
        return saldo < 0;

    }
}