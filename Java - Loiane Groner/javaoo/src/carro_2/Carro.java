package carro_2;

public class Carro {
    String marca;

    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //método sem retrono
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " km");
    }

    //método com retorno
    double obterAutonomia() {
        System.out.println("Método Autonômia com retorno");
        return capacidadeCombustivel * consumoCombustivel;
    }

    //métdo com parâmetro
    double calcularCombustivel(double kilometros) {

        double quantidadeCombustivel = kilometros / consumoCombustivel;
        return quantidadeCombustivel;
    }

    Carro (){
        System.out.println("Classe carro instanciada");
        numeroPassageiros = 4;
    }





}
