package exercicios;

import java.util.Scanner;

public class Ex044 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean votantes = true;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int brancos = 0;
        int nulos = 0;
        int voto;
        String nomeVencedor = "nenhum";
        int contador = 0;
        int vencedor = 0;
        int percentualC1;
        int percentualC2;
        int percentualC3;
        int percentualC4;
        int percentualN;
        int percentualB;

        while (votantes) {
            System.out.println("\nEleições 2026\n\nLista de candidatos:\n1 - Candidato 1\n2 - Candidato 2\n3 - Candidato 3\n4 - Candidato 4\n5 - Voto em branco\n6 - Voto nulo\n\n");
            System.out.print("Digite a sua opção: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    brancos++;
                    break;
                case 6:
                    nulos++;
                    break;
            }
            contador++;
            if (voto == 0) {
                contador--;
                votantes = false;
            }
        }

        if (candidato1 > vencedor) {
            vencedor = candidato1;
            nomeVencedor = "Candidato 1";
        }
        if (candidato2 > vencedor) {
            vencedor = candidato2;
            nomeVencedor = "Candidato 2";
        }
        if (candidato3 > vencedor) {
            vencedor = candidato3;
            nomeVencedor = "Candidato 3";
        }
        if (candidato4 > vencedor) {
            vencedor = candidato4;
            nomeVencedor = "Candidato 4";
        }
        if (brancos > vencedor) {
            vencedor = brancos;
            nomeVencedor = "Votos Brancos";
        }
        if (nulos > vencedor) {
            vencedor = nulos;
            nomeVencedor = "Votos Nulos";
        }
        percentualC1 = (candidato1 * 100) / contador;
        percentualC2 = (candidato2 * 100) / contador;
        percentualC3 = (candidato3 * 100) / contador;
        percentualC4 = (candidato4 * 100) / contador;
        percentualB = (brancos * 100) / contador;
        percentualN = (nulos * 100) / contador;

        System.out.println("\nApuração das Eleições 2026:");
        System.out.println("\nTotal de votos do Candidato 1: " + candidato1 + " - o percentual de votos: " + percentualC1);
        System.out.println("Total de votos do Candidato 2: " + candidato2 + " - o percentual de votos: " + percentualC2);
        System.out.println("Total de votos do Candidato 3: " + candidato3 + " - o percentual de votos: " + percentualC3);
        System.out.println("Total de votos do Candidato 4: " + candidato4 + " - o percentual de votos: " + percentualC4);
        System.out.println("Total de votos em brancos: " + brancos + " - o percentual de votos: " + percentualB);
        System.out.println("Total de votos nulos: " + nulos + " - o percentual de votos: " + percentualN);
        System.out.println("\nO vencedor desta eleição foi: " + nomeVencedor);
    }

}
