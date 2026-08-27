package carro_2;

import carro.CarroGenerics;

public class Teste_Carro {

    static void main(String[] args) {

        Carro van = new Carro();

//        van.marca = "Fiat";
//        van.modelo = "Ducato";
//        van.numeroPassageiros = 10;
//        van.capacidadeCombustivel = 100;
//        van.consumoCombustivel = 0.2;


        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numeroPassageiros);
        System.out.println(van2.capacidadeCombustivel);
        System.out.println(van2.consumoCombustivel);
    }
}
