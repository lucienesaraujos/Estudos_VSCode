package carro;

public class CarroVan {
    public static void main(String[] args) {
        
        CarroGenerics van = new CarroGenerics();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        System.out.println("A autonômia do carro é: " + autonomia);
        System.out.println("A autonômia do carro é: " + van.obterAutonomia());
        
        CarroGenerics fusca = new CarroGenerics();
        
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroPassageiros = 5;
        fusca.capacidadeCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        double quantidadeCombustivel = fusca.calcularCombustivel(10);
        System.out.println("Quantidade de combustível para andar 10km: " + quantidadeCombustivel);

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();
        
    }
}
