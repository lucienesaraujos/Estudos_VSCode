package exercicios;

import java.util.Scanner;

public class Ex037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maisAlto = Double.MIN_VALUE;
        double maisBaixo = Double.MAX_VALUE;
        double maisGordo = Double.MIN_VALUE;
        double maisMagro = Double.MAX_VALUE;
        int codigo = 0;
        double altura;
        double peso;
        double mediaAltura;
        double mediaPeso;
        double totalPeso = 0;
        double totalAltura = 0;
        boolean cadastro = true;
        String resposta;
        int alunos = 0;

        while (cadastro) {
            alunos++;
            System.out.println("Digite seu código: ");
            codigo = scanner.nextInt();
            System.out.println("Digite a sua altura: ");
            altura = scanner.nextDouble();
            System.out.println("Digite o seu peso: ");
            peso = scanner.nextDouble();

            if (altura > maisAlto) {
                maisAlto = altura;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
            }
            if (peso > maisGordo) {
                maisGordo = peso;
            }
            if (peso < maisMagro) {
                maisMagro = peso;
            }
            totalPeso += peso;
            totalAltura += altura;

            System.out.println("Deseja cadastrar outro aluno? S/N");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("N")) {
                cadastro = false;
            }

        }

        mediaAltura = totalAltura / alunos;
        mediaPeso = totalPeso / alunos;

        System.out.println("O aluno mais alto tem: " + maisAlto + "m");
        System.out.println("O aluno mais baixo tem: " + maisBaixo + "m");
        System.out.println("O aluno mais magro pesa: " + maisMagro + "kg");
        System.out.println("O aluno mais gordo pesa: " + maisGordo + "kg");
        System.out.println("A média de altura dos alunos é: " + mediaAltura + "m");
        System.out.println("A média de peso dos alunos é: " + mediaPeso + "kg");
    }
}
