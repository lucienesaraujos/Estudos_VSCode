package ex004;

public class ConversorVolume {
    public static double equivalenteCentimetro;
    public static double equivalenteLitro;
    public static double equivalentePe;
    public static double equivalentePolegada;
    public static double equivalenteLitroGalao;
    public double mais;
    public double menos;

    public ConversorVolume() {
    }

    public static double converterLitroCentimetro (double litro) {
        equivalenteCentimetro = litro * 1000;
        return equivalenteCentimetro;
    }

    public static double converterMetroLitro (double metro) {
        equivalenteLitro = metro * 1000;
        return equivalenteLitro;
    }

   public static double converterMetroPe(double metro) {
        equivalentePe = metro * 35.32;
        return equivalentePe;
   }
   public static double converterGalaoPolegada(double galao) {
        equivalentePolegada = galao * 231;
        return equivalentePolegada;
   }

   public static double converterGalaoLitro(double galao) {
        equivalenteLitroGalao = galao * 3.785;
        return equivalenteLitroGalao;
   }

    public static double getEquivalenteCentimetro() {
        return equivalenteCentimetro;
    }

    public static void setEquivalenteCentimetro(double equivalenteCentimetro) {
        ConversorVolume.equivalenteCentimetro = equivalenteCentimetro;
    }

    public static double getEquivalenteLitro() {
        return equivalenteLitro;
    }

    public static void setEquivalenteLitro(double equivalenteLitro) {
        ConversorVolume.equivalenteLitro = equivalenteLitro;
    }

    public static double getEquivalentePe() {
        return equivalentePe;
    }

    public static void setEquivalentePe(double equivalentePe) {
        ConversorVolume.equivalentePe = equivalentePe;
    }

    public static double getEquivalentePolegada() {
        return equivalentePolegada;
    }

    public static void setEquivalentePolegada(double equivalentePolegada) {
        ConversorVolume.equivalentePolegada = equivalentePolegada;
    }

    public static double getEquivalenteLitroGalao() {
        return equivalenteLitroGalao;
    }

    public static void setEquivalenteLitroGalao(double equivalenteLitroGalao) {
        ConversorVolume.equivalenteLitroGalao = equivalenteLitroGalao;
    }

}
