package exercicios_get_set;

public class Lampada_2 {

    private String cor;
    private String modelo;
    private double preco;
    private int quantidade;
    private String tensao;
    private int garantia;
    private int potencia;
    private String[] tipos;
    private String marca;
    private String tipoLuz;

    public Lampada_2() {
    }

    public Lampada_2(String marca, String tipoLuz, String cor, String modelo, double preco, int quantidade, String tensao, int garantia, int potencia, String[] tipos) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.tensao = tensao;
        this.garantia = garantia;
        this.potencia = potencia;
        this.tipos = tipos;
        this.marca = marca;
        this.tipoLuz = tipoLuz;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void ligarLampada() {
        System.out.println("Ligar lâmpada -> Lâmpada ligada!");
    }

    public void desligarLampada() {
        System.out.println("Desligar lâmpada -> Lâmpada desligada!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }
}
