package contatos;

public class testeAgenda {
    public static void main(String[] args) {
        
    agenda contato001 = new agenda();

    contato001.nome = "nome";
    contato001.sobrenome = "sobrenome";
    contato001.endereco = "Rua das ";
    contato001.email = "@gmail.com";
    contato001.telefones = new String[2];
    contato001.telefones[0] = "900001111";
    contato001.telefones[1] = "900001112";
    }
}
