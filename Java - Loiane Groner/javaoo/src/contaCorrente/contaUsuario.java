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

    double sacarDinheiro(){
        if (valorEmConta < valorDebitado){
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
        
        }
        return saldo - valorDebitado;
    }

    double depositarDinheiro (){
        saldo += deposito;
        return saldo;
    }

    void consultarSaldo(){
        System.out.println("Seu saldo atual é " + saldo);
    }

    void usarChequeEspecial(){
        if (valorDebitado > saldo){
            System.out.println("Você usou " + (valorDebitado - saldo) + "do limite especial");
        }
    }
    

}
