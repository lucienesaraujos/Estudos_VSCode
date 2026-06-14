import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        /*
        1.
        System.out.println("Alo, mundo! Finalmente Java começa a fazer sentido! Graças a Deus!!!");
        */

        /*
        2.
        System.out.println("Digite um número de 0 a 100: ");
        int numero1 = scanner.nextInt();
        System.out.println("Você escolheu o número: " + numero1);
        */

        /*
        3.
        System.out.println("Vamos executar as operações aritméticas. Digite o 1º: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º: ");
        int numero2 = scanner.nextInt();
        System.out.println(numero1 + " + " + numero2 + " é igual a: " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " é igual a: " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " é igual a: " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " é igual a: " + (numero1 / numero2));
        System.out.println(numero1 + " % " + numero2 + " é igual a: " + (numero1 % numero2));
        */

        /*
        4. na correção ela usou double, boa deveria ter usado
        System.out.println("Calculadora do notas");
        System.out.println("Digite a 1ª nota: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite a 2ª nota: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite a 3ª nota: ");
        int n3 = scanner.nextInt();
        System.out.println("Digite a 4ª nota: ");
        int n4 = scanner.nextInt();
        int soma = n1+n2+n3+n4;
        int media = soma/4;
        System.out.println("================================");
        System.out.println("O total das suas notas é: " + soma + ". A média das suas notas é: " + media);
        */

        /*
        5.
        System.out.println("Conversor de Metros em centimentros");
        System.out.println("Digite a quantidade de metros a ser convertido: ");
        double metros = scanner.nextDouble();
        double conversao = metros * 100;
        System.out.println("O total em centimentros é: " + conversao);
        */

        /*
        6. Adicionar class math --> Math.PI * Math.pow(raio,2)
        System.out.println("Calcular a área de um círculo");
        System.out.println("Digite o raio: ");
        double raio = scanner.nextDouble();
        double conversao = 3.14 * (raio*raio);
        System.out.println("A área do círculo é: " + conversao);
        */

        /*
        7. Adicionar class math --> Math.PI * Math.pow(lado,2)
        System.out.println("Calcular a área de um quadrado");
        System.out.println("Digite o tamanho do lado: ");
        double lado = scanner.nextDouble();
        double area = lado * 2;
        System.out.println("A área do quadrado é: " + area);
        System.out.println("o dobro da área do quadrado é: " + (area*2));
        */

        /*
        8.
        System.out.println("Calcular salário");
        System.out.println("Digite o total de horas trabalhadas: ");
        double horas = scanner.nextDouble();
        System.out.println("Digite o valor da hora trabalhadas: ");
        double valorhora = scanner.nextDouble();
        double salario = horas * valorhora;
        System.out.println("Seu salário é R$: " + salario);
        */

        /*
        9.
        System.out.println("Conversor de temperatura");
        System.out.println("Digite a temperatura em Fº: ");
        double F = scanner.nextDouble();
        double C = (5 * (F -32) / 9);
        System.out.println("A tempertaura em Celsius é: " + C);
        */

        /*
        10.
        System.out.println("Conversor de temperatura");
        System.out.println("Digite a temperatura em Cº: ");
        double C = scanner.nextDouble();
        double F = (C * 1.8) + 32;
        System.out.println("A tempertaura em Celsius é: " + F);
        */

        /*
        11. --> math.pow(num3,3)
        System.out.println("Digite o 1º número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o 3º número: ");
        double numero3 = scanner.nextDouble();
        int resultado1 = (numero1*2) * (numero2/2);
        double resultado2 = (numero1*3) + numero3;
        double resultado3 = numero3*numero3*numero3; 
        System.out.println("" + numero1 + "*2 x " +  "" + numero2 + "/2 = " + resultado1);
        System.out.println("" + numero1 + "*3 + " + "" + numero3 + " = " + resultado2);
        System.out.println("" + numero3 + "³ = " + resultado3);
        */

        /*
        12.
        System.out.println("Digite a sua altura em metros : ");
        double altura = scanner.nextDouble();
        double peso = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + peso);
        */

        /*
        13 - inacabado :(
        System.out.println("Digite a sua altura em metros : ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o seu sexo [F/M]: ");
        String sexo = scanner.nextLine(); 
        System.out.println("Seu peso atual: ");
        double pesoatual = scanner.nextDouble();
        
        switch {
            case 1: "F";
            double pesoFem = (62.1 * altura) - 44.7;
            if (pesoFem = pesoatual); {
                System.out.println("Você está no peso ideal");
            } elseif (pesoFem > pesoatual); {
                System.out.println("Você está acima do peso ideal");
            } else {
            break;    
            
            case 2: "M";
            double pesoMas = (72.7 * altura) - 58;
            if (pesoMas = pesoatual); {
                System.out.println("Você está no peso ideal");
            } elseif (pesoMas > pesoatual); {
                System.out.println("Você está acima do peso ideal");
            } else {
            break;    
        }
        */

        /*
        14.
        System.out.println("Digite o peso do peixe: ");
        int pesoPeixe = scanner.nextInt();
        if (pesoPeixe > 50){
            int excedente = (pesoPeixe - 50);
            int multa = excedente * 4;
            System.out.println("Seu peixe excedeu " + excedente + " kg do valor permitido. Você pagará uma multa no valor de: " + multa + " reais.");
            } else {
            System.out.println("Seu peixe não excedeu o peso perimitido. 0,00 reais a pagar de multa"); 
        }
        */

        /*
        15.
        System.out.println("Calcular salário");
        System.out.println("Digite o total de horas trabalhadas: ");
        double horas = scanner.nextDouble();
        System.out.println("Digite o valor da hora trabalhadas: ");
        double valorhora = scanner.nextDouble();
        double salario = horas * valorhora;
        double liquido = salario - (salario * 0.24);
        System.out.println("Seu salário é R$: " + liquido);
        */

        /*
        16.
        System.out.println("Calcular pintura");
        System.out.println("Digite a área em metros²: ");
        double area = scanner.nextDouble();
        double tintaNecessaria = area / 54;
        double valorTinta = tintaNecessaria * 80;
        System.out.println("A quantidade de tinta necessária é: " + tintaNecessaria + ". O valor da tinta é: " + valorTinta);
        */

        /*
        17. inacabado :'(
        System.out.println("Calcular pintura");
        System.out.println("Digite a área em metros²: ");
        double area = scanner.nextDouble();
        double rendeLata = 18 * 6;
        double rendeGalao = 3.6 * 6; 
        double valorLata = 80;
        double valorGalao = 25;
        double tintaNecessaria = ((area / 6) + (area/6)*0.1);
            if (tintaNecessaria >= rendeLata) {
                double valortinta = tintaNecessaria * valorLata;
            } else if (tintaNecessaria <= rendeGalao) {
                double valortinta = tintaNecessaria * valorGalao; 
            } else if () {

            }
        System.out.println("A quantidade de tinta necessária é: " + tintaNecessaria + ". O valor da tinta é: " + valorTinta);
        */

        
        /*
        System.out.println("Digite o tamnaho do arquivo em MB");
        double arquivo = scanner.nextDouble();
        System.out.println("Digite a velocidade de download em Mb");
        double taxaDownload = scanner.nextDouble();
        double efetivo = arquivo / taxaDownload;
        System.out.println("Seu download vai demorar cerca de " + efetivo + " minutos");
        */
    }
}
