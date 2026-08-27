package ex006;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a Banco Java");
        System.out.println("Vamos abrir sua conta");
        System.out.println("Qual seu nome?");
        String nome = sc.next();
        System.out.println("Qual valor deseja depositar?");
        double saldo = sc.nextDouble();
        System.out.println("Qual valor deseja sacar?");
        double valor = sc.nextDouble();
        int numConta = (int)(Math.random()*10000);

        contaPoupanca clientePoupanca = new contaPoupanca();
        clientePoupanca.setNomeCliente(nome);
        clientePoupanca.setSaldo(saldo);
        clientePoupanca.setNumConta(numConta);
        clientePoupanca.sacarDinheiro(valor);
        clientePoupanca.setDiaRendimento(2);
        if (clientePoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é: " + clientePoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento");
        }


        System.out.println("Bem-vindo a Banco Java");
        System.out.println("Vamos abrir sua conta");
        System.out.println("Qual seu nome?");
        String nome2 = sc.next();
        System.out.println("Qual valor deseja depositar?");
        double saldo2 = sc.nextDouble();
        int numConta2 = (int)(Math.random()*10000);
        System.out.println("Qual valor deseja sacar?");
        double valor2 = sc.nextDouble();

        contaEspecial clienteEspecial = new contaEspecial();
        clienteEspecial.setNomeCliente(nome2);
        clienteEspecial.setSaldo(saldo2);
        clienteEspecial.setNumConta(numConta2);
        clienteEspecial.sacarDinheiro(valor2);

        System.out.println("Cliente Poupança");
        System.out.println(clientePoupanca);


        System.out.println();

        System.out.println("Cliente Especial");
        System.out.println(clienteEspecial);



    }
}
