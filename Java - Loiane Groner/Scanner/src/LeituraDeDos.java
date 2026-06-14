import java.util.Scanner;

public class LeituraDeDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Seu nome completo é " + nomeCompleto);

        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Digite o seu nome, a sua idade, a sua altura, quantos filhos tem, possui animais: ");
        String nome = scanner.next();
        int idade = scanner.nextInt();
        float altura = scanner.nextFloat();
        byte filhos = scanner.nextByte();
        boolean pet = scanner.nextBoolean();
        System.out.println("Seu primeiro nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Você tem: " + filhos + " filhos");
        System.out.println("Você tem pets: " + pet);





    }
}
