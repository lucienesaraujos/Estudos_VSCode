package agenda;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual agenda deseja acessar?");
        String donaAgenda = sc.nextLine();
        Agenda agenda = new Agenda(donaAgenda);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
        System.out.println("Digite as informações do " + (i +1) + " contato que deseja salvar");
        Contato contato = new Contato();
        System.out.println("Digite o nome");
        String nome = sc.nextLine();
        contato.setNome(nome);
        System.out.println("Digite o numero");
        String numero = sc.nextLine();
        contato.setTelefone(numero);
        System.out.println("Digite o e-mail");
        String email = sc.nextLine();
        contato.setEmail(email);

        contatos[i] = contato;
        }
        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
