package ex005;

public class ConversorTempo {

    public static double equivalenteSegundos;
    public static double equivalenteMinutos;
    public static double equivalenteHoras;
    public static double equivalenteDiasSemenas;
    public static double equivalenteDiasMeses;
    public static double equivalenteDiasAnos;

    public static double converterMinutoSegundo(double minuto) {
        equivalenteSegundos = minuto * 60;
        return equivalenteSegundos;
    }

    public static double converterHoraMinuto(double hora) {
        equivalenteMinutos = hora * 60;
        return equivalenteMinutos;
    }

    public static double converterDiaHora(double dia) {
        equivalenteHoras = dia * 24;
        return equivalenteHoras;
    }

    public static double converterSemanaDia(double semana) {
        equivalenteDiasSemenas = semana * 7;
        return equivalenteDiasSemenas;
    }

    public static double converterMesDia(double mes) {
        equivalenteDiasMeses = mes * 30;
        return equivalenteDiasMeses;
    }

    public static double converterAnoMes(double ano) {
        equivalenteDiasAnos = ano * 365;
        return equivalenteDiasAnos;
    }

    public ConversorTempo() {
    }

    public static double getEquivalenteSegundos() {
        return equivalenteSegundos;
    }

    public static void setEquivalenteSegundos(double equivalenteSegundos) {
        ConversorTempo.equivalenteSegundos = equivalenteSegundos;
    }

    public static double getEquivalenteMinutos() {
        return equivalenteMinutos;
    }

    public static void setEquivalenteMinutos(double equivalenteMinutos) {
        ConversorTempo.equivalenteMinutos = equivalenteMinutos;
    }

    public static double getEquivalenteHoras() {
        return equivalenteHoras;
    }

    public static void setEquivalenteHoras(double equivalenteHoras) {
        ConversorTempo.equivalenteHoras = equivalenteHoras;
    }

    public static double getEquivalenteDiasSemenas() {
        return equivalenteDiasSemenas;
    }

    public static void setEquivalenteDiasSemenas(double equivalenteDiasSemenas) {
        ConversorTempo.equivalenteDiasSemenas = equivalenteDiasSemenas;
    }

    public static double getEquivalenteDiasMeses() {
        return equivalenteDiasMeses;
    }

    public static void setEquivalenteDiasMeses(double equivalenteDiasMeses) {
        ConversorTempo.equivalenteDiasMeses = equivalenteDiasMeses;
    }

    public static double getEquivalenteDiasAnos() {
        return equivalenteDiasAnos;
    }

    public static void setEquivalenteDiasAnos(double equivalenteDiasAnos) {
        ConversorTempo.equivalenteDiasAnos = equivalenteDiasAnos;
    }
}
