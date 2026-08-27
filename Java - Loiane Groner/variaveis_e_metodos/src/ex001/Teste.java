package ex001;

public class Teste {
    public static void main(String[] args) {

        Contador.adicionarContador(13);
        System.out.println(Contador.getSomarContador());
        Contador.subtrairContador(2);
        System.out.println(Contador.getDiminuirContador());
        Contador.zerarContador();
        System.out.println(Contador.getContadorZerado());

        // TODO: Não testei o todo no intelli
        // FIXME: segundo teste


    }
}
