package contato;

public class Teste {
    static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Luciene Araujo");

        Endereco endereco = new Endereco();
        contato.setEndereco(endereco); // fazer verificação atráves do if null
        endereco.setRua("Heitor Pinheiro");
        endereco.setNumero("77");
        endereco.setComplemento("Fundos");
        endereco.setBairro("Pinheiro");
        endereco.setCidade("Manhuaçu");
        endereco.setEstado("Minas Gerais");
        endereco.setCep("36.902-120");

        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("33");
        telefone.setNumero("98423-5288");
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("33");
        telefone2.setNumero("3331-8754");
        Telefone[] telefones = new Telefone[2]; // verificação if
        telefones[0] = telefone;
        telefones[1] = telefone2;
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getRua());
            System.out.println(contato.getEndereco().getNumero());
            System.out.println(contato.getEndereco().getComplemento());
            System.out.println(contato.getEndereco().getBairro());
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println(contato.getEndereco().getCep());
        }
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
