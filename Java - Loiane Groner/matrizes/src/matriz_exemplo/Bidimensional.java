package matriz_exemplo;

public class Bidimensional {
    public static void main(String[] args) {
        
        double [][] notasAlunos = new double[5][4];
        //exemplo de inicialização >> double [][] notasAlunos2 = {{10, 7, 8, 9.5}, {9, 8, 7, 9}};

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
        
        notasAlunos[3][0] = 7;
        notasAlunos[3][1] = 10;
        notasAlunos[3][2] = 7.5;
        notasAlunos[3][3] = 8;
        
        notasAlunos[4][0] = 5;
        notasAlunos[4][1] = 8;
        notasAlunos[4][2] = 7;
        notasAlunos[4][3] = 8.5;

        double soma = 0;
        String resposta = "";

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos [i][j] + " - ");
            }
            System.out.println();
        }
        //mudar nota:
        notasAlunos [1][3] = 8;

        System.out.println("Média e status dos alunos");

        for (int i = 0; i < notasAlunos.length; i++){
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos [i][j];
                if (soma/4 >= 7){
                    resposta = "Aprovado!";
                } else {
                    resposta = "Reprovado!";
                }
            }
            System.out.println("Média do aluno " + (i+1) + " é: " + (soma/4)+ " - " + resposta);
        }
    }
}
