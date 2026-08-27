package ex003;

public class Teste {
    public static void main(String[] args) {
        ConversorArea.converterMetrosPes(250);
        System.out.println("Metros -> Pés: " + ConversorArea.getEquivalentePes());

        ConversorArea.converterPesCentimetros(85);
        System.out.println("Pés -> Centimetros: " + ConversorArea.getEquivalenteCentimetros());

        ConversorArea.converterMilhasAcres(762);
        System.out.println("Milhas -> Acres: " + ConversorArea.getEquivalenteAcres());

        ConversorArea.converterAcresPes(12);
        System.out.println("Acres -> Pes: " + ConversorArea.getEquivalentePes2());

    }
}
