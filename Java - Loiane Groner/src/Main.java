
import java.time.OffsetDateTime;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
    
    /*
    Imprima o nome e a idade
    System.out.println("Qual é o seu nome? ");
    var nome = scanner.next();
    System.out.println("Qual a sua idade? ");
    var idade = scanner.nextInt();
    System.out.printf("Olá %s você tem %s anos\n", nome, idade);
    */

    /* 
    Imprima o tamanho da area de um quadrado equilatero
    System.out.println("Calculadora de quadrados. Digite o tamnaho e descubra a área do quadrado: ");
    var tamanho = scanner.nextInt();
    System.out.printf("A area do quadrado é %s\n", tamanho*2);
    */    

    /*
    Imprima a area de um retangulo
    System.out.println("Calculadora de área.");
    System.out.println("Digite a altura: "); 
    var altura = scanner.nextInt();
    System.out.println("Digite a largura:");
    var largura = scanner.nextInt();
    var tamanho = altura * largura;
    System.out.printf("A área é %s\n", tamanho);
    */
    
    //Compare a idade de 2 pessoas
    System.out.println("1º usuário\nDigite seu nome: ");
    var nome1 = scanner.next();
    System.out.println("Digite o ano do nascimento: ");
    var ano1 =  scanner.nextInt();
    System.out.println("2º usuário\nDigite seu nome: ");
    var nome2 = scanner.next();
    System.out.println("Digite o ano do nascimento: ");
    var ano2 =  scanner.nextInt();
    var ano = OffsetDateTime.now().getYear();
    var idade1 = ano - ano1;
    var idade2 = ano - ano2;
    var diferenca = idade1 - idade2;
    System.out.printf("%s tem %s anos, %s tem %s anos e a diferença de idade é %s anos\n", nome1, idade1, nome2, idade2, diferenca);
   }
}