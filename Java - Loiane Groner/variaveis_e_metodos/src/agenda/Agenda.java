package agenda;

public class Agenda {

    private String donoAgenda;
    private Contato[] contatos;

    public Agenda() {
    }
    public Agenda(String donoAgenda) {
        this.donoAgenda = donoAgenda;
    }

    public String getDonoAgenda() {
        return donoAgenda;
    }

    public void setDonoAgenda(String donoAgenda) {
        this.donoAgenda = donoAgenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Agenda do(a) " +  donoAgenda + "\n";

        if(contatos != null){
            for(Contato c : contatos){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }


}
