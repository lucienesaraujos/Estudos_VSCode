package ex008;

public class Peixe extends Animal {
    private int patas = 0;
    private String ambiente = "Mar";
    private String cor = "Cinzento";
    private String caracteristicas = "Barbatanas e cauda";

    public Peixe() {
    }

    @Override
    public int getPatas() {
        return patas;
    }

    @Override
    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String getAmbiente() {
        return ambiente;
    }

    @Override
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCaracterísticas: " + caracteristicas;
    }
}
