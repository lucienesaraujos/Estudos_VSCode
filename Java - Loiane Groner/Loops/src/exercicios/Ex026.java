package exercicios;

import java.util.Scanner;

public class Ex026 {
    // FIXME:
    // TODO:
    // BUG: 
    // [ ]:
    // [x]:
    // HACK:
    // NOTE:
    // USEFUL:
    // COMMENT:
    // LEARN:
    // RECHECK:
    // INCOMPLETE:
    // SEE NOTES:
    // POST:
    // ALERT:
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votantes = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int brancos = 0;
        int nulos = 0;
        int voto;
        int vencedor = 0;

        System.out.print("Digite a quantidade de votantes: ");
        votantes = scanner.nextInt();
        
        for(int i = 1; i <= votantes; i++){
            System.out.println("\nEleições 2026\n\nLista de candidatos:\n1 - Candidato 1\n2 - Candidato 2\n3 - Candidato 3\n4 - Voto em branco\n5 - Voto nulo\n\n");
            System.out.print("Digite a sua opção: ");
            voto = scanner.nextInt();

            switch (voto) {
            case 1: candidato1++; break;
            case 2: candidato2++; break;
            case 3: candidato3++; break;
            case 4: brancos++; break;
            case 5: nulos++; break;
            } 
        }
        
        if (candidato1 > vencedor ){
            vencedor = candidato1;
        } else if (candidato2 > vencedor){
            vencedor = candidato2;
        } else if (candidato3 > vencedor){
            vencedor = candidato3;
        } else if(brancos > vencedor){
            vencedor = brancos;
        } else if(nulos > vencedor){
            vencedor = nulos;
        }

        System.out.println("\nApuração das Eleições 2026:");
        System.err.println("\nTotal de votos do Candidato 1: " + candidato1);
        System.err.println("Total de votos do Candidato 2: " + candidato2);
        System.err.println("Total de votos do Candidato 3: " + candidato3);
        System.out.println("Total de votos em brancos: " +brancos);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("\nO vencedor desta eleição foi: " + vencedor);
    }

}
