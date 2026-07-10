package lampada;

public class informacoesLampada {
    
    String marca;
    String tipoLuz;
    String cor;
    String modelo;
    double preco;
    int quantidade;
    String tensao;
    int garantia;
    int potencia;
    String[] tipos;

    void ligarLampada(){
        System.out.println("Lâmpada está acessa");
    }

    void desligarLampada(){
        System.out.println("Lâmpada está apagada");
    }

}