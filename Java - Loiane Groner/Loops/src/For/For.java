package For;

public class For {
public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        System.out.println("Valor de i: " + i);
        
    System.out.println("================");
    }

    for (int i = 5; i > 0; i--) {
        System.out.println("Valor de i: " + i);
    }
        
    System.out.println("================");
        
    for (int i = 0, j = 20 ; i < j; i++, j--) {
        System.out.println("Valor de i: " + i + "; Valor de j: " + j + ";");
    }
        
    System.out.println("================");
        
    int x = 0;
    for ( ; x < 10; ) {
        System.out.println("Valor de x: " + x);
        x += 2;
    }
    
    System.out.println("================");
    
    for (int z = 0; z < 10; z += 2) {
        System.out.println("Valor de z: " + z);
    }
    
    System.out.println("================");
    
    int soma = 0;
    for (int i = 1; i < 10; soma += i++);
    System.out.println("A soma total é " + soma);
    
    System.out.println("================");
        
    
    }
}
