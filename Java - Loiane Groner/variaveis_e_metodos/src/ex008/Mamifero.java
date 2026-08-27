package ex008;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero() {
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAlimento: " + alimento;
    }
}
