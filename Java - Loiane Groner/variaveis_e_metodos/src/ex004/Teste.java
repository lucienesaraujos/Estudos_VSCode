package ex004;

public class Teste {
    public static void main(String[] args) {

        ConversorVolume.converterLitroCentimetro(159);
        System.out.println("Litros -> Centimetros: " + ConversorVolume.getEquivalenteCentimetro());

        ConversorVolume.converterMetroLitro(159);
        System.out.println("Metros -> Litros: " + ConversorVolume.getEquivalenteLitro());

        ConversorVolume.converterMetroPe(159);
        System.out.println("Metros -> Pés: " + ConversorVolume.getEquivalentePe());

        ConversorVolume.converterGalaoPolegada(159);
        System.out.println("Galões -> Polegadas: " + ConversorVolume.getEquivalentePolegada());

        ConversorVolume.converterGalaoLitro(159);
        System.out.println("Galões -> Litros: " + ConversorVolume.getEquivalenteLitroGalao());

    }
}
