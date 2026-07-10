package carro;

public class carroGenerico {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //método sem retrono
    void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " km");
	}

    //método com retorno
    double obterAutonomia(){
        System.out.println("Método Autonômia com retorno");
        return capacidadeCombustivel * consumoCombustivel;
    }

    //métdo com parâmetro
    double calcularCombustivel (double kilometros) {

        double quantidadeCombustivel = kilometros / consumoCombustivel;
        return quantidadeCombustivel;
        
    }
}
