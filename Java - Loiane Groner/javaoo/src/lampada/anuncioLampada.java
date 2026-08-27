package lampada;

public class anuncioLampada {

    public static void main(String[] args) {

        informacoesLampada lampada001 = new informacoesLampada();
        lampada001.marca = "Inova Tech";
        lampada001.tipoLuz = "LED";
        lampada001.cor = "Amarela";
        lampada001.modelo = "Ab58";
        lampada001.preco = 12.9;
        lampada001.quantidade = 1;
        lampada001.tensao = "Bivolt";
        lampada001.garantia = 90;
        lampada001.potencia = 7;
        lampada001.tipos = new String[4];
        lampada001.tipos[0] = "abajur";
        lampada001.tipos[1] = "pendente";
        lampada001.tipos[2] = "parede";
        lampada001.tipos[3] = "rosca";

        lampada001.desligarLampada();

        System.err.println("Teste de usabilidade");

        lampada001.ligarLampada();

    }
}
