package ex003;

public class ConversorArea {

    public static double equivalentePes;
    public static double equivalenteCentimetros;
    public static double equivalenteAcres;
    public static double equivalentePes2;

    public ConversorArea() {
    }

    public static double converterMetrosPes(double metro){
        equivalentePes = metro * 10.76;
        return equivalentePes;
    }

    public static double converterPesCentimetros(double pes){
        equivalenteCentimetros = pes * 929;
        return equivalenteCentimetros;
    }

    public static double converterMilhasAcres(double milhas){
        equivalenteAcres = milhas * 640;
        return equivalenteAcres;
    }

    public static double converterAcresPes(double acres){
        equivalentePes2 = acres * 43560;
        return equivalentePes2;
    }

    public static double getEquivalentePes() {
        return equivalentePes;
    }

    public static void setEquivalentePes(double equivalentePes) {
        ConversorArea.equivalentePes = equivalentePes;
    }

    public static double getEquivalenteCentimetros() {
        return equivalenteCentimetros;
    }

    public static void setEquivalenteCentimetros(double equivalenteCentimetros) {
        ConversorArea.equivalenteCentimetros = equivalenteCentimetros;
    }

    public static double getEquivalenteAcres() {
        return equivalenteAcres;
    }

    public static void setEquivalenteAcres(double equivalenteAcres) {
        ConversorArea.equivalenteAcres = equivalenteAcres;
    }

    public static double getEquivalentePes2() {
        return equivalentePes2;
    }

    public static void setEquivalentePes2(double equivalentePes2) {
        ConversorArea.equivalentePes2 = equivalentePes2;
    }
}
