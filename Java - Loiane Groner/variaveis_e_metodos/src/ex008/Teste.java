package ex008;

public class Teste {
    static void main() {
        Animal animal  = new Animal();
        animal.setNome("Camelo");
        animal.setComprimento(150);
        animal.setPatas(animal.getPatas());
        animal.setCor("Amarelo");
        animal.setAmbiente(animal.getAmbiente());
        animal.setVelocidade(2);

        Peixe peixe = new Peixe();
        peixe.setNome("Tubarão");
        peixe.setComprimento(300);
        peixe.setPatas(peixe.getPatas());
        peixe.setCor(peixe.getCor());
        peixe.setAmbiente(peixe.getAmbiente());
        peixe.setVelocidade(1.5);
        peixe.setCaracteristicas(peixe.getCaracteristicas());

        Mamifero mamifero2 = new Mamifero();
        mamifero2.setNome("Urso do Canadá");
        mamifero2.setComprimento(180);
        mamifero2.setPatas(mamifero2.getPatas());
        mamifero2.setCor("Vermelho");
        mamifero2.setAmbiente(mamifero2.getAmbiente());
        mamifero2.setVelocidade(0.5);
        mamifero2.setAlimento("Mel");

        System.out.println("***** ZOO *****");
        System.out.println(animal);
        System.out.println(peixe);
        System.out.println(mamifero2);
    }
}
