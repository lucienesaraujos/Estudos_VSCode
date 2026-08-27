package ex005;

public class Teste {
    public static void main(String[] args) {

        ConversorTempo.converterMinutoSegundo(35);
        System.out.println("Minutos -> Segundos: " + ConversorTempo.getEquivalenteSegundos());

        ConversorTempo.converterHoraMinuto(35);
        System.out.println("Horas -> Minutos: " + ConversorTempo.getEquivalenteMinutos());

        ConversorTempo.converterDiaHora(35);
        System.out.println("Dias -> Horas: " + ConversorTempo.getEquivalenteHoras());

        ConversorTempo.converterSemanaDia(35);
        System.out.println("Semanas -> Dias: " + ConversorTempo.getEquivalenteDiasSemenas());

        ConversorTempo.converterMesDia(35);
        System.out.println("Meses -> Dias: " + ConversorTempo.getEquivalenteDiasMeses());

        ConversorTempo.converterAnoMes(35);
        System.out.println("Anos -> Dias: " + ConversorTempo.getEquivalenteDiasAnos());
    }
}
