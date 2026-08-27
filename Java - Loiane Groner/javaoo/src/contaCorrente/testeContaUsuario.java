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
        contaUsuario001.valorEspecialUsado = 0;

        boolean saqueEfetuado = contaUsuario001.realizarSaque(150);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado");
            System.out.print("Saldo atual: " + contaUsuario001.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        contaUsuario001.depositar(50);
        contaUsuario001.consultarSaldo();

        if (contaUsuario001.verficarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
        
//    contaUsuario001.sacarDinheiro();
//
//    contaUsuario001.depositarDinheiro ();
//
//    contaUsuario001.consultarSaldo();
//
//    contaUsuario001.usarChequeEspecial();

    }
}
