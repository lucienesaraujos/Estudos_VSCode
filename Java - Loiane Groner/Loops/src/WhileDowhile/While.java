package WhileDowhile;

public class While {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contando até: " + max);

        while (i < max){
            System.out.println("Valor de i: " + i);
            i++; // ou i = i + 1; ou i += 1;
        }
    }
}
