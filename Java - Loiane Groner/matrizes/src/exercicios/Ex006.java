package exercicios;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        
        String[][] jogo = { { "1", "2", "3" }, { "4", "5", "6", }, { "7", "8", "9" } };
        boolean jogada = true;
        int posicao = 0;
        String movimento = "";
        String movimentoO = "O";
        String movimentoX = "X";
        String mensagem = "";
        int rodadas = 1;
        
        TODO: // mellhorar programa: validar posição, finalização automática e definir vencedor

        System.out.println(" ** JOGO DA VELHA ** ");
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo[i].length; j++) {
                System.out.print(" | " + jogo[i][j] + " | ");
            }
            System.out.println();
        }

        while (jogada) {
            System.out.println("Deseja marcar [O] ou [X]");
            movimento = scanner.next();
            if (movimento.equalsIgnoreCase("O")){
                movimento = movimentoO;
            } else {
                movimento = movimentoX;
            }
            System.out.println("Escolha a casa para marcar a posição");
            posicao = scanner.nextInt();
            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[i].length; j++) {
                    switch (posicao) {
                        case 1:
                            jogo[0][0] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 2:
                            jogo[0][1] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 3:
                            jogo[0][2] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 4:
                            jogo[1][0] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 5:
                            jogo[1][1] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 6:
                            jogo[1][2] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 7:
                            jogo[2][0] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 8:
                            jogo[2][1] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 9:
                            jogo[2][2] = movimento;
                            System.out.print(" | " + jogo[i][j] + " | ");
                            break;
                        case 0:
                            jogada = false; break;
                    }
                }
                System.out.println();
            }
        }
        
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo[i].length; j++) {
                if (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X" ||  
                    jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X" || 
                    jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X" || 
                    
                    jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X" ||
                    jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X" || 
                    jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X" || 
                    
                    jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X") {
                    mensagem = "[X]  >> ganhou";
                }
                
                if (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O" ||  
                    jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O" || 
                    jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O" || 
                    
                    jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O" ||  
                    jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O" || 
                    jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O" || 
                    
                    jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O") {
                    mensagem = "[O]  >> ganhou";
                }
            }
        }
        System.out.println(mensagem);
    }
}
