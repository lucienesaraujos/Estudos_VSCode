package exercicios;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][][] agenda = new String[12][31][8];
        int dia = 0;
        int hora = 0;
        int mes = 0;
        String resposta = "";
        boolean adicionar = true;

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                for (int k = 0; k < agenda[i].length; k++) {
                    while (adicionar) {
                        System.out.println("Escolha o mês: ");
                        mes = scanner.nextInt();
                        System.out.println("Escolha o dia: ");
                        dia = scanner.nextInt();
                        System.out.println("Escolha o horário: ");
                        hora = scanner.nextInt();
                        System.out.println("Escreva a tarefa a ser agendada: ");
                        agenda[i][j][k] = scanner.next();
                        System.out.println("Deseja adicionar mais tarefas: S / N");
                        resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("N")) {
                            adicionar = false;
                        }
                        System.out.println("\n Dia " + dia);
                        System.out.println(hora + "h00 -->> " + agenda[i][j][k]);
                    }
                }
            }
        }
    }
}
