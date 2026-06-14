package Exercicios;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declarar variáveis fora dos loops e reaproveitar boolean, com uma boolean generica
        boolean nomeV = false;
        boolean idadeV = false;
        boolean salarioV = false;
        boolean estCivilV = false;
        boolean generoV = false;

        do {
            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();
            if (nome.length() >= 3) {
                nomeV = true;
            } else {
                System.out.println("O nome deve ter no mínimo 3 caracteres");
            }
        } while (!nomeV);

        do {
            System.out.println("Digite digite sua idade: ");
            int idade = scanner.nextInt();
            if (idade >= 0 && idade <= 150) {
                idadeV = true;
            } else {
                System.out.println("Digite uma idade entre 0 a 150 anos");
            }
        } while (!idadeV);

        do {
            System.out.println("Digite digite seu salário: ");
            double salario = scanner.nextDouble();
            if (salario > 0) {
                salarioV = true;
            } else {
                System.out.println("Digite um valor maior que 0.00");
            }
        } while (!salarioV);

        do {
            System.out.println("Digite seu gênero [F ou M]: ");
            String genero = scanner.next();
            if (genero.equalsIgnoreCase("f")) {
                generoV = true;
            } else if (genero.equalsIgnoreCase("m")) {
                generoV = true;
            } else {
                System.out.println("Escolha uma opção válida");
            }
        } while (!generoV);

        do {
            System.out.println("Digite o seu estado civil:\nS - Solteiro(a)\nC - Casado(a)\nD - Divorciado(a)\nV - Viúvo(a):");
            String estCivil = scanner.next();
            if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || estCivil.equalsIgnoreCase("d") || estCivil.equalsIgnoreCase("v")) {
                estCivilV = true;
            } else {
                System.out.println("Escolha uma opção válida");
            }
        } while (!estCivilV);
    }
}
