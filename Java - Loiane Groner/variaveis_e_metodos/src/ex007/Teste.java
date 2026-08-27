package ex007;

public class Teste {
    public static void main(String[] args) {

        PF pf1 = new PF();
        pf1.setNome("Ana");
        pf1.setRenda(1300);
        System.out.println(pf1);
        pf1.calcularImposto(pf1.getRenda());
        System.out.println("*******************");

        PF pf2 = new PF();
        pf2.setNome("Bruna");
        pf2.setRenda(1500);
        System.out.println(pf2);
        pf2.calcularImposto(pf2.getRenda());
        System.out.println("*******************");

        PF pf3 = new PF();
        pf3.setNome("Carolina");
        pf3.setRenda(2200);
        System.out.println(pf3);
        pf3.calcularImposto(pf3.getRenda());
        System.out.println("*******************");

        PF pf4 = new PF();
        pf4.setNome("Daiana");
        pf4.setRenda(2900);
        System.out.println(pf4);
        pf4.calcularImposto(pf4.getRenda());
        System.out.println("*******************");

        PF pf5 = new PF();
        pf5.setNome("Eliana");
        pf5.setRenda(5000);
        System.out.println(pf5);
        pf5.calcularImposto(pf5.getRenda());
        System.out.println("*******************");

        PJ pj1 = new PJ();
        pj1.setNome("Luar Artesanatos");
        pj1.setRenda(15000);
        System.out.println(pj1);
        pj1.calcularImposto(pj1.getRenda());
        System.out.println("*******************");
    }
}
