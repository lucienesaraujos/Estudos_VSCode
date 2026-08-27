package exercicios_get_set;

import java.util.Scanner;

public class Teste_ContaCorrente2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente_2 teste_usuario = new ContaCorrente_2();
        teste_usuario.setSaldo(100);
        teste_usuario.setQuantiaASacar(150);

        System.out.println("Seu saldo é: " + teste_usuario.getSaldo());


        /*int menu;
        System.out.print("Escolha qual ação deseja realizar:\n1 - Consultar saldo\n2 - Realizar saque\n3 - Realizar depósito\n4 - Consultar limite Cheque Especial\n5 - Sair\n");
        menu = scanner.nextInt();
        switch (menu){
            case 1: teste_usuario.consultarSaldo();
                break;
            case 2: teste_usuario.realizarSaque(300);
                break;
            case 3: teste_usuario.realizarDeposito(400);
                break;
            case 4: teste_usuario.verificarUsoChequeEspecial();
                break;
            case 5: System.exit(0);
            default: System.out.println("Opção inválida!");
                break;
        }*/





    }
}
