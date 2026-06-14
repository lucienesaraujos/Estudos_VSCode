public class Operacoes {
    public static void main(String[] args) {
        /*
        //Aritméticos
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String nome1 = "Luciene";
        String nome2 = "Araujo";
        String nome3 = nome1 + nome2;
        System.out.println(nome3); 

        //Começamos com 3
        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);
        //soma e imprime o valor resultante da soma

        System.out.println(resultado++);
        //imprime o resultado sem o valor acréscimo, e depois acrescenta 1 

        System.out.println(++resultado);
        //a variável vale 6. Primeiro acrescenta o valor 1, e depois imprime o valor resultante da soma.  

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);
        */

        /*
        //Relacionais
        int valor1 = 10;
        int valor2 = 20;
        System.out.println("Valor 1 == valor 2: " + (valor1 == valor2));
        System.out.println("Valor 1 != valor 2: " + (valor1 != valor2));
        System.out.println("Valor 1 > valor 2: " + (valor1 > valor2));
        System.out.println("Valor 1 >= valor 2: " + (valor1 >= valor2));
        System.out.println("Valor 1 < valor 2: " + (valor1 < valor2));
        System.out.println("Valor 1 <= valor 2: " + (valor1 <= valor2));
        */

        //Lógicos
        int valor1 = 1;
        int valor2 = 2;
        
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("Valor 1 é 10 AND Valor 2 é 20 - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("Valor 1 é 10 OR Valor 2 é 20 - resultado: " + resultado2);

        boolean V = true;
        boolean F = false;
        System.out.println(V && F);
        System.out.println(V || F);
        System.out.println(V ^ F);
        System.out.println(!V && F);

    }
}
