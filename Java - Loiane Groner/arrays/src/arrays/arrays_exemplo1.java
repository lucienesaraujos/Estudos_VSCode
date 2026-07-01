package arrays;
public class arrays_exemplo1 {
    public static void main(String[] args) {
        double[] temp = new double[365];
        temp[0] = 30.16;
        temp[1] = 30.5;
        temp[2] = 30.3;
        temp[3] = 30.9;
        temp[4] = 30.2;
        temp[5] = 30.4;

        System.out.println("O valor da temperatura do dia 1 é: " + temp[0]);
        System.out.println("O tamanho do array (quantidade de espaços da memória): " + temp.length);

        // for (int i = 0; i < temp.length; i++){
        //     System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temp[i]);
        // }

        for (double temperatura : temp){
            System.out.println(temperatura);
        }
    }
}
