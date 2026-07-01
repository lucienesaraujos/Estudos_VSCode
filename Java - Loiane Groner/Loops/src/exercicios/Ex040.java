package exercicios;

import java.util.Scanner;

public class Ex040 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // codigoSP = 1, frotaSP = 9_650_000, obitosSP = 1034;
        // codigoRJ = 2, frotaRJ = 3_130_000, obitosRJ = 640;
        // codigoBH = 3, frotaBH = 2_700_000, obitosBH = 200;
        // codigoBR = 4, frotaBR = 2_080_000, obitosBR = 271;
        // codigoCR = 5, frotaCR = 1_740_000, obitosCR = 200;
        int codigo = 0;
        int frota = 0;
        int obitos = 0;
        int maisAcidentes = Integer.MIN_VALUE;
        int menosAcidentes = Integer.MAX_VALUE;
        int cidMaisAcid;
        int cidMenosAcid;
        int mediaFrota;
        int mediaAcidMenor2 = 0;
        int somaAcidMenor2 = 0;
        int contador2 = 0;
        int codMaisAcid = 0;
        int codMenosAcid = 0;
        int somaFrota = 0;
        int contFrota = 0;
        
        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite o código da cidade: ");
            codigo = scanner.nextInt();
            System.out.print("Digite o tamanho da frota: ");
            frota = scanner.nextInt();
            System.out.print("Digite a quantidade de óbitos: ");
            obitos = scanner.nextInt();
            
            if (obitos > maisAcidentes) {
                maisAcidentes = obitos;
                codMaisAcid = codigo;
            }
            if (obitos < menosAcidentes) {
                menosAcidentes = obitos;
                codMenosAcid = codigo;
            }
            contFrota++;
            somaFrota += frota;
            if (frota < 2_000_000) {
                contador2++;
                somaAcidMenor2 += obitos;
                mediaAcidMenor2 = somaAcidMenor2/contador2;
            }
            
        }
        mediaFrota = somaFrota/contFrota;
        System.out.println("Cidade com mais acidentes fatais: " + codMaisAcid + " - Número de fatalidades: " + maisAcidentes);
        System.out.println ("Cidade com menos acidentes fatais: " + codMenosAcid + " - Número de fatalidades: " + menosAcidentes);
        System.out.println("A média de frotas das " + contFrota + " cidades listados é: " + mediaFrota);
        System.out.println("Existem " + contador2 + " cidades com menos de 2.000.000 de veiculos. A média de vítimas de acidentes fatais é: " + mediaAcidMenor2);
    }
}
