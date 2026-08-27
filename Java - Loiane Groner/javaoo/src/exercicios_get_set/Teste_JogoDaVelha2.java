package exercicios_get_set;

import jogoDaVelha.JogoDaVelha;

import java.util.Scanner;

public class Teste_JogoDaVelha2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha_2 jogoDaVelha = new JogoDaVelha_2();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Vez do Jogador 1. Escolha linha e coluna (1 - 3)");
                sinal = 'X';
            } else {
                System.out.println("Vez do Jogador 2. Escolha linha e coluna (1 - 3)");
                sinal = 'O';
            }
            linha = valor ("linha", scanner);
            coluna = valor ("coluna", scanner);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente");
            };

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns!!! Jogador 1 ganhou!!!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns!!! Jogador 2 ganhou!!!");
            } else if (jogoDaVelha.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida!!!");
            }
        }
    }
    static int valor(String tipoValor, Scanner scanner) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scanner.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor--;
        return valor;
    }
}
