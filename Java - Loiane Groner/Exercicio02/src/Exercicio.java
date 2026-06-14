
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        /*
        System.out.println("Digite o 1º número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else {
            System.err.println(numero2 + " é maior que " + numero1);
        }
        */

        /*
        2.
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        
        if (numero1 >= 0) {
            System.out.println(numero1 + " é positivo");
        } else {
            System.err.println(numero1 + " é negativo ");
        }
        */

        /*
        //3.
        System.out.println("Digite F ou M: ");
        String sexo = scanner.nextLine();
        
        if (sexo.equalsIgnoreCase( "F")) {
            System.out.println(sexo + " Feminino");
        } else if  (sexo.equalsIgnoreCase("M")) {
            System.err.println(sexo + " Masculino");
        } else {
            System.err.println(" Escolha F ou M");
        }
        */

        /*
        4.
        System.out.println("Digite uma letra do alfabeto: ");
        String letra = scanner.nextLine();
                
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("Você escolheu uma vogal");
        } else {
            System.err.println("Você escolheu uma consoante");
        }
        
        //outra forma fazer, incluindo o teste de apenas 1 caractere

         if (letra.length() > 1) {
            System.out.println("Você escolheu uma vogal");
        } else {
            switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":System.out.println("Você escolheu uma vogal");
            default: System.err.println("Você escolheu uma consoante");
           }
        }

        */

        /*
        5.
        System.out.println("Digite o 1ª nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite o 2ª nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2; 

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.err.println("Aprovado");
        } else {
            System.err.println("Reprovado");
        }
        */

        /*
        6.
        System.out.println("Digite o 1º número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o 3º número: ");
        int numero3 = scanner.nextInt();

        // esse programa daria erro se o usuário digitasse 2 números iguais, para evitar use >=

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1 + " é o maior número");
        } else if (numero2 > numero3 && numero2 > numero1) {
            System.out.println(numero2 + " é o maior número");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + " é o maior número ");
        } 
        */

        /*
        7.
        System.out.println("Digite o 1º número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o 3º número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(numero1 + " é o maior número e " + numero3 + " é o menor número");
        } else if (numero1 < numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(numero2 + " é o maior número e " + numero3 + " é o menor número");
        } else if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
            System.out.println(numero3 + " é o maior número e " + numero1 + " é o menor número ");
        } 
        */


        /*
        8.
        System.out.println("Digite o 1º número: ");
        int produto1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int produto2 = scanner.nextInt();
        System.out.println("Digite o 3º número: ");
        int produto3 = scanner.nextInt();


        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println(produto1 + " é o melhor preço");
        } else if (produto2 < produto3 && produto2 < produto1) {
            System.out.println(produto2 + " é o melhor preço");
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.println(produto3 + " é o melhor preço ");
        } 
        */

        /*
        9. Terminar essa lógica
        System.out.println("Digite o 1º número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o 3º número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(" " + numero1 + " " + numero2 + " " + numero3);

} else if (numero1 < numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(" " + numero1 + " " + numero3 + " " + numero2);

        } else if (numero1 < numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(" " + numero2 + " " + numero1 + " " + numero3);

} else if (numero1 < numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(" " + numero2 + " " + numero3 + " " + numero1);

        } else if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
            System.out.println(" " + numero3 + " " + numero2 + " " + numero1);

} else if (numero1 < numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(" " + numero3 + " " + numero2 + " " + numero1);

        }    
        */

        /*
        10.
        System.out.println("Digite seu noturno [ M / V / N ]: ");
        String noturno = scanner.nextLine();
        switch (noturno.toUpperCase()){ 
        case "m":
        case "M": System.out.println("Bom dia!"); break;
        case "v":
        case "V": System.out.println("Boa tarde!"); break;
        case "n": 
        case "N": System.out.println("Boa noite!"); break;
        default: System.out.println("Opção inválida"); break;
        }

        ou

        if (letra.equalsIgnoreCase("M") {
            System.out.println("Bom dia!");
        } else if (letra.equalsIgnoreCase("V") {
            System.out.println("Boa tarde!");
        } elseif (letra.equalsIgnoreCase("N") {
            System.out.println("Boa Noite");
        } else {
            System.out.println("Você escolheu uma vogal");
        } 

        */

        /*
        11.
        System.out.println("Digite seu salário atual: ");
        double salario = scanner.nextDouble();
        if (salario <= 280) {
            double salarioReajustado1 = salario + (salario * 0.2);
            System.out.println("Salario atual: " + salario);
            System.out.println("O percentual de aumento foi 20%. O valor é: " + salario * 0.2);
            System.out.println("Salario reajustado: " + salarioReajustado1);

        } else if (salario < 701){
            double salarioReajustado2 = salario + (salario * .015);
            System.out.println("Salario atual: " + salario);
            System.out.println("O percentual de aumento foi 15%. O valor é: " + salario * 0.15);
            System.out.println("Salario reajustado: " + salarioReajustado2);

        } else if (salario < 1501) {
            double salarioReajustado3 = salario + (salario * 0.1);
            System.out.println("Salario atual: " + salario);
            System.out.println("O percentual de aumento foi 10%. O valor é: " + salario * 0.1);
            System.out.println("Salario reajustado: " + salarioReajustado3);

        } else if (salario >= 1501) {
            double salarioReajustado4 = salario + (salario * 0.05);
            System.out.println("Salario atual: " + salario);
            System.out.println("O percentual de aumento foi 5%. O valor é: " + salario * 0.05);
            System.out.println("Salario reajustado: " + salarioReajustado4);
        }
        */

        /*
        12.
        System.out.println("Digite seu salário atual: ");
        double salario = scanner.nextDouble();
        double sindicato = salario * 0.03;
        double inss = salario * 0.10;
        double fgts = salario * 0.11;

        if (salario <= 900) {
            System.out.println("Salário bruto: " + salario);
            System.out.println("Sem de desconto de IR");
            System.out.println("Valor do Sindicato: " + sindicato);
            System.out.println("Valor do INSS: " + inss);
            System.out.println("Valor do FGTS: " + fgts);
            System.out.println("Total de descontos: " + (inss + sindicato));
            System.out.println("Salário Líquido: " + (salario - sindicato - inss));
            
        } else if (salario < 1501){
            System.out.println("Salário bruto: " + salario);
            double imposto1 = salario * 0.05;
            System.out.println("Valor do Imposto de Renda: " + imposto1);
            System.out.println("Valor do Sindicato: " + sindicato);
            System.out.println("Valor do INSS: " + inss);
            System.out.println("Valor do FGTS: " + fgts);
            System.out.println("Total de descontos: " + (inss + sindicato));
            System.out.println("Salário Líquido: " + (salario - imposto1- sindicato - inss));

        } else if (salario < 2501) {
            System.out.println("Salário bruto: " + salario);
            double imposto2 = salario * 0.1;
            System.out.println("Valor do Imposto de Renda: " + imposto2);
            System.out.println("Valor do Sindicato: " + sindicato);
            System.out.println("Valor do INSS: " + inss);
            System.out.println("Valor do FGTS: " + fgts);
            System.out.println("Total de descontos: " + (inss + sindicato));
            System.out.println("Salário Líquido: " + (salario - imposto2- sindicato - inss));

        } else if (salario >= 2501) {
            System.out.println("Salário bruto: " + salario);
            double imposto3 = salario * 0.2;
            System.out.println("Valor do Imposto de Renda: " + imposto3);
            System.out.println("Valor do Sindicato: " + sindicato);
            System.out.println("Valor do INSS: " + inss);
            System.out.println("Valor do FGTS: " + fgts);
            System.out.println("Total de descontos: " + (inss + fgts));
            System.out.println("Salário Líquido: " + (salario - imposto3- sindicato - inss));
        }
            //Funciona, mas pode ser melhor estruturado
            System.out.println("Digite seu salário atual: ");
            double salario = scanner.nextDouble();
            double sindicato = salario * 0.03;
            double inss = salario * 0.10;
            double fgts = salario * 0.11;
            
            double percentualIR = 0;
             if (salario <= 900) {
                percentualIR = 0;            
            } else if (salario < 1501){
                percentualIR = 0.05;
            } else if (salario < 2501) {
                percentualIR = 0.1;
            } else if (salario >= 2501) {
                percentualIR = 0.2;
            }

            double ir = salario * percentualIR;
            double totalDesc = sindicato + inss + ir;
            double salarioLiq = salario - totalDesc;

            System.out.println("Salário bruto: " + salario);
            System.out.println("Valor do Imposto de Renda: " + ir);
            System.out.println("Valor do Sindicato: " + sindicato);
            System.out.println("Valor do INSS: " + inss);
            System.out.println("Valor do FGTS: " + fgts);
            System.out.println("Total de descontos: " + totalDesc);
            System.out.println("Salário Líquido: " + salarioLiq);
        */
        
        /*
        13.
        System.out.println("Escolha um número entre 1 a 7: ");
        int dia = scanner.nextInt();
        switch (dia){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("opção inválida"); break;
        }
        */

        /*
        14.
        System.out.println("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media >= 9) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + ". Sua média foi: " + media + ". Seu conceito foi: A - Aluno Aprovado");
        } else if (media >= 7.5){
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + ". Sua média foi: " + media + ". Seu conceito foi: B - Aluno Aprovado");
        } else if (media >= 6){
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + ". Sua média foi: " + media + ". Seu conceito foi: C - Aluno Aprovado");
        } else if (media >= 4) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + ". Sua média foi: " + media + ". Seu conceito foi: D - Aluno Reprovado");
        } else {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + ". Sua média foi: " + media + ". Seu conceito foi: E - Aluno Reprovado");
        }
        */

        /*
        15.
        System.out.println("Informe três medidas separadas por espaço: ");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        
        if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2){
            System.out.println("Essas medidas podem formar um triângulo");
            if (lado1 == lado2 && lado2 == lado3){
               System.out.println("Triângulo Equilátero"); 
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
                System.out.println("Triângulo Isósceles");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Essas medidas não podem formar um triângulo");
        }
        */

        /*
        16.
        System.out.println("Informe o valor de A: ");
        double valorA = scanner.nextDouble(); //
        System.out.println("Informe o valor de B: ");
        double valorB = scanner.nextDouble();
        System.out.println("Informe o valor de C: ");
        double valorC = scanner.nextDouble();

        if (valorA == 0) {
            System.out.println("Valor de A obrigatoriamente tem que ser maior que 0");
        } else if (((valorB * valorB) - (4 * valorA * valorC)) < 0 ) {
            System.out.println("O valor de Delta é negativo, e não possui raízes reais");
        } else if (((valorB * valorB) - (4 * valorA * valorC)) == 0) {
            System.out.println("O valor de Delta é Zero, e possui 1 raiz");
            double delta =  ((valorB * valorB) - (4 * valorA * valorC));
            double x3 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
            double x4 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
            System.out.println("O valor de X1 é: " + x3 + ". O valor de X2 é: " + x4 + ".");
        } else if (((valorB * valorB) - (4 * valorA * valorC)) > 0) {
            double delta =  ((valorB * valorB) - (4 * valorA * valorC));
            double x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
            double x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
            System.out.println("O valor de X1 é: " + x1 + ". O valor de X2 é: " + x2 + ".");
        }
        */

        /*
        17.
        System.out.println("Escolha um ano [AAAA]: ");
        int ano = scanner.nextInt();
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0)) {
            System.out.println("Este ano é bissexto");
        } else {
            System.out.println("Este ano não é bissexto");
        }
        */

        /*
        18. Eu não sei comparar data em Java
        System.out.println("Escolha uma data [dd/mm/aaaa]: ");
        int data = scanner.nextInt();
        */

        /*
        19. Não sei como resolver
        System.out.println("Digite um número de 1 a 999: ");
        int numero = scanner.nextInt();
        */

        /*
        20.
        System.out.println("Digite o 1ª nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite o 2ª nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite o 3ª nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3; 

        if (media == 10) {
            System.out.println("Sua média foi: " + media + ". Aprovado com Distinção!");
        } else if (media >= 7) {
            System.err.println("Sua média foi: " + media + ". Aprovado!");
        } else {
            System.err.println("Sua média foi: " + media + ". Reprovado!");
        }
        */

        /*
        21.
        System.out.println("Informe o valor desejado para saque: ");
        int saque = nextInt();
        int minimo = 10;
        int maximo = 600;
        */

        /*
        22.
        System.out.println("Escolha um número: ");
        double numero = scanner.nextDouble();
        
        if (numero % 2 == 0) {
            System.out.println("Este número é PAR");
        } else {
            System.out.println("Este número é ÍMPAR");
        }
        */

        /*
        22. Em suma, eu não sei se respondi certo
        System.out.println("Escolha um número: ");
        double numero = scanner.nextDouble();
        
        if (numero % 2 == 1) {
            System.out.println("Este número é DECIMAL");
        } else {
            System.out.println("Este número é INTEIRO");
        }
        */

        /* 
        24. A parte de decimal está errada
        System.out.println("Digite um número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Escolha a operação a ser realizada: ");
        String operacao = scanner.next();
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;



        if (operacao.equals("+")) {
            System.out.println(numero1 + " + " + numero2 + " é igual a: " + soma);
            if (soma % 2 == 0) {System.out.println("Este número é par");
            } else {
                System.out.println("Este número é impar");
            }
            if (soma >= 0){System.out.println("Este número é positivo");
            } else {
                System.out.println("Este número é negativo");
            }  
            if (soma % 2 == 1){System.out.println("Este número é decimal");
            } else {
                System.out.println("Este número é inteiro");
            } 
        }
        
        if (operacao.equals("-")) {
            System.out.println(numero1 + " - " + numero2 + " é igual a: " + subtracao);
            if (subtracao % 2 == 0) {System.out.println("Este número é par");
            } else {
                System.out.println("Este número é impar");
            }
            if (subtracao >= 0){System.out.println("Este número é positivo");
            } else {
                System.out.println("Este número é negativo");
            }  
            if (subtracao % 2 == 1){System.out.println("Este número é decimal");
            } else {
                System.out.println("Este número é inteiro");
            }
        }

        if (operacao.equals("*")) {
            System.out.println(numero1 + " * " + numero2 + " é igual a: " + multiplicacao);
            if (multiplicacao % 2 == 0) {System.out.println("Este número é par");
            } else {
                System.out.println("Este número é impar");
            }
            if (multiplicacao >= 0){System.out.println("Este número é positivo");
            } else {
                System.out.println("Este número é negativo");
            }  
            if (multiplicacao % 2 == 1){System.out.println("Este número é decimal");
            } else {
                System.out.println("Este número é inteiro");
            }
        }

        if (operacao.equals("/")) {
            System.out.println(numero1 + " / " + numero2 + " é igual a: " + divisao);
            if (divisao % 2 == 0) {System.out.println("Este número é par");
            } else {
                System.out.println("Este número é impar");
            }
            if (divisao >= 0){System.out.println("Este número é positivo");
            } else {
                System.out.println("Este número é negativo");
            }  
            if (divisao % 2 == 1){System.out.println("Este número é decimal");
            } else {
                System.out.println("Este número é inteiro");
            }
        }

        //aplicando boolean 

        System.out.println("Digite um número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Escolha a operação a ser realizada: ");
        String operacao = scanner.next();
        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+": resultado = numero1 + numero2; break;
            case "-": resultado = numero1 - numero2; break;
            case "*": resultado = numero1 * numero2; break;
            case "/": resultado = numero1 / numero2; break;
            default: System.out.println("Operação inválida"); valida = false;
        }
         
        System.out.println("Resultado: " + resultado);

        if (valida) {
            
            if (resultado >=0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            
            if (resultado % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }
        */     

        /*
        //25.
        System.out.println("Você telefonou para a vitima");
        String pergunta1 = scanner.next();
        System.out.println("Esteve no local do crime");
        String pergunta2 = scanner.next();
        System.out.println("Mora perto da vítima");
        String pergunta3 = scanner.next();
        System.out.println("Devia para a vitima");
        String pergunta4 = scanner.next();
        System.out.println("Já trabalhou com a vitima");
        String pergunta5 = scanner.next();
        int contador = 0;

        if (pergunta1.equalsIgnoreCase("S")){
            contador++;
        }
        if (pergunta2.equalsIgnoreCase("S")){
            contador++;
        }
        if (pergunta3.equalsIgnoreCase("S")){
            contador++;
        }
        if (pergunta4.equalsIgnoreCase("S")){
            contador++;
        }
        if (pergunta5.equalsIgnoreCase("S")){
            contador++;
        }


        if (contador == 5){
            System.out.println("Culpado");
        } else if (contador == 4 || contador == 3){
            System.out.println("Cúmplice");
        } else if (contador == 2){
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }

        //ou
        
        switch (contador) {
            case 5 -> System.out.println("Culpado");
            case 4, 3 -> System.out.println("Cúmplice");
            case 2 -> System.out.println("Suspeito");
            case 1, 0 -> System.out.println("Inocente");
        }
        */
        
        /*
        26.
        System.out.println("Escolha o combustível [ A / G ]: ");
        String combustivel = scanner.next();
        System.out.println("Quantidade de combustível: ");
        double quantidade = scanner.nextDouble();
        double alcool = 1.9;
        double gasolina = 2.5;
        double desconto = 0;
        double total = 0;
        double totalDesc;
        double totalApagar;

        
        if (combustivel.equalsIgnoreCase("A")) {
            if (quantidade < 21) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            } 
            total = quantidade * alcool;
        }
             

        if (combustivel.equalsIgnoreCase("G")) {
            if (quantidade < 21) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
            total = quantidade * gasolina;
        }
            
        totalDesc = total * desconto;

        totalApagar = total - totalDesc;

        System.out.println("Total a ser pago: " + totalApagar);
        */

        ///*
        //27.
        System.out.println("Quantidade de morangos: ");
        double morango = scanner.nextDouble();
        System.out.println("Quantidade de maçãs: ");
        double maca = scanner.nextDouble();
        double precoMorango;
        double precoMaca;
        double totalMorango = 0;
        double totalMaca = 0;
        double totalPeso;
        double totalCompra;
        double desconto = 0;
        double valorCompra = 0;

     
        if (morango <= 5){
            precoMorango = 2.5;
        } else {
            precoMorango = 2.2;
        }
        totalMorango = morango * precoMorango;

        if (maca <= 5){
            precoMaca = 1.8;
        } else {
            precoMaca = 1.5;
        }
        totalMaca = maca * precoMaca;
        
        totalPeso = morango + maca;
       
        totalCompra = totalMorango + totalMaca;

        valorCompra = totalCompra;
        
        if (totalPeso > 8 || totalCompra > 25){
            valorCompra = totalCompra - (totalCompra * desconto);    
        }  
        
        System.out.println("Valor a ser pago: " + valorCompra);
        
        
        //*/

        scanner.close();
    }

}
