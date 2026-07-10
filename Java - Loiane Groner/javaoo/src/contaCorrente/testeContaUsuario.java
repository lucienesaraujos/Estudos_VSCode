package contaCorrente;

public class testeContaUsuario {
    public static void main(String[] args) {
    
    contaUsuario contaUsuario001 = new contaUsuario();
    contaUsuario001.agencia = "Itaú";
    contaUsuario001.idConta = 1254896;
    contaUsuario001.saldo = 5698.69;
    contaUsuario001.especial = true;
    contaUsuario001.limite = 10000;
    contaUsuario001.valorDebitado = 12500;
    contaUsuario001.deposito = 1000;
    contaUsuario001.valorEmConta = contaUsuario001.saldo + contaUsuario001.limite;

    
    contaUsuario001.sacarDinheiro();
    
    contaUsuario001.depositarDinheiro ();

    contaUsuario001.consultarSaldo();

    contaUsuario001.usarChequeEspecial();





    }
}
