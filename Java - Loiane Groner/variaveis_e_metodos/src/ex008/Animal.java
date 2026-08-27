package ex008;

public class Animal {
    private String nome;
    private int comprimento;
    private int patas = 4;
    private String cor;
    private String ambiente = "Terra";
    private double velocidade;

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "------------------------------" +
                "\nAnimal: " + this.getNome() +
                "\nComprimento: " + this.getComprimento()+ " cm" +
                "\nPatas: " + this.getPatas() +
                "\nCor: " + this.getCor() +
                "\nAmbiente: " + this.getAmbiente() +
                "\nVelocidade: " + this.getVelocidade() + " m/s";
    }
}
