package exercicios;

import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {

        boolean sucesso = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do usuário: ");
            String nome = scanner.next();
            System.out.println("Digite a senha do usuário: ");
            String senha = scanner.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Nome e Senha não podem ser iguais, por favor, tente novamente");
            } else {
                sucesso = true;
                System.out.println("Nome e Senha cadastrados com sucesso!");
            }
        } while (!sucesso);
    }
}
