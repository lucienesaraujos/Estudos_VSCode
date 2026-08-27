package heranca;

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String telefoneFixo;
    private String telefoneCelular;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefoneFixo, String telefoneCelular, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String obterEtiquetaEndereco();

    public abstract void imprimirEtiquetaEndereco();
}
