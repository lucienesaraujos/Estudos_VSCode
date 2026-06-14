
import java.util.Scanner;

public class IfEElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        //Condições:
        //10 = barato
        //10 < valor < 15 = pedir desconto
        //15 < valor < 17 = pesquisar mais
        //>= 17 = muito caro
         
        /*
        System.out.println("Digite o valor do item: ");
        double valor = scanner.nextDouble();

        if (valor <= 10) {
            System.out.println("Comprar");            
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pedir desconto");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Não comprar");
        }
        */

        //1. Domingo ... 7.Sábado
        
        System.out.println("Digite um dia da semana [1/7]: ");
        int dia = scanner.nextInt();
        /*    
        if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda");
        } else if (dia == 3){
            System.out.println("Terça");
        } else if (dia == 4){
           System.out.println("Quart");
        } else if (dia == 5){
            System.out.println("Quinta");
        } else if (dia == 6){
            System.out.println("Sexta");
        } else if (dia == 7){
            System.out.println("Sábdo");
        } else {
            System.out.println("Não é um dia da semana válido");
        }
        */

        /*
        switch(dia){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia válido da semana"); break;
        }
        */

        switch(dia){
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            case 7, 1 -> System.out.println("Final de semana");
            default -> System.out.println("Não é um dia válido da semana");
        }
    }
}
