package exercicios;

import java.util.Scanner;

public class Ex043 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cd0 = "Cachorro Quente";
        String cd1 = "Bauru Simples";
        String cd2 = "Bauru com Ovo";
        String cd3 = "Hambúger";
        String cd4 = "Cheeseburguer";
        String cd5 = "Refrigerante";
        Double pr0 = 1.2;
        Double pr1 = 1.3;
        Double pr2 = 1.5;
        Double pr3 = 1.2;
        Double pr4 = 1.3;
        Double pr5 = 1.0;
        int quantidade;
        int codigo;
        double valorTotalItem = 0;
        double valorTotalPedido = 0;
        boolean pedido = true;
        String resposta;

        while (pedido) {
            System.out.println("Digite o codigo do cardápio: ");
            codigo = scanner.nextInt();
            System.out.println("Digite a quantidade do pedido: ");
            quantidade = scanner.nextInt();
            
            switch (codigo){
                case 100: System.out.println(cd0 +" "+  quantidade + " - valor unitário: " + pr0 + " - Valor total: " + (valorTotalItem =(quantidade * pr0)));break;
                case 101: System.out.println(cd1 +""+  quantidade + " - valor unitário: " + pr1 + "Valor total: " + (valorTotalItem =(quantidade * pr1)));break;
                case 102: System.out.println(cd2 +""+  quantidade + " - valor unitário: " + pr2 + "Valor total: " + (valorTotalItem =(quantidade * pr2)));break;
                case 103: System.out.println(cd3 +""+  quantidade + " - valor unitário: " + pr3 + "Valor total: " + (valorTotalItem =(quantidade * pr3)));break;
                case 104: System.out.println(cd4 +""+  quantidade + " - valor unitário: " + pr4 + "Valor total: " + (valorTotalItem =(quantidade * pr4)));break;
                case 105: System.out.println(cd5 +""+  quantidade + " - valor unitário: " + pr5 + "Valor total: " + (valorTotalItem =(quantidade * pr5)));break;
                
            }
            valorTotalPedido += valorTotalItem;
            
            System.out.println("Deseja acrescentar mais itens? S /N ");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                pedido = false;
            }
        }
        System.out.println("Valor total do pedido: " + valorTotalPedido);
    }
}
