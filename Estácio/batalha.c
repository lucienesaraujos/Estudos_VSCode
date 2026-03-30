# include <stdio.h>
# include <stdlib.h>

int main (){
        
        int i, j, tab [10] [10], posicao1=1, posicao2=1,posicao3=1,posicao4=1, livre1=1, livre2=1, livre3=1, livre4=1;
        char let [10] = {'A','B','C','D','E','F','G','H','I','J'};
    
        
        printf("Bem-vindo a Batalha Naval\n");
        printf("\nVeja o seu tabuleiro\n\n");
    
        for (i = 0; i < 10; i++) {
            for(j = 0; j < 10; j++){
            tab [i][j] = 0;
            }
        }
        
        //horizontal
        if (3+3-1>9){
            posicao1 = 0;
        }
        for (j = 0; j < 3; j++){
            if (tab [3][3+j] !=0){
                livre1 =0;
                break;
            }
        }
        for (j = 0; j<3; j++){
            tab [3][3+j] = 3;
        }
    
        //vertical
        if (7+3-1>9){
            posicao2 = 0;
        }
        for (i = 0; i < 3; i++){
            if (tab [7+i][7] !=0){
                livre2 = 0;
                break;
            }
        }    
        for (i = 0; i < 3; i++){
            tab [7+i][7] = 3;
        }
        
        //diagonal 1
        if(0+3-1>9 && 1+3-1>9 && 2+3-1>9){
        posicao3 = 0;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
                if (tab[0][0] && tab [1][1] && tab [2][2] != 0) {
                    livre3 = 0;
                    break;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
            tab [0][0] = 3;
            tab [1][1] = 3;
            tab [2][2] = 3;    
        }

        // diagonal 2
        if(6+3-1>9 && 7+3-1>9 && 8+3-1>9){
        posicao3 = 0;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
                if (tab[6][3] && tab [7][2] && tab [8][1] != 0) {
                    livre3 = 0;
                    break;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
            tab [6][3] = 3;
            tab [7][2] = 3;
            tab [8][1] = 3;    
        }

        //Cones
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
                if (tab [0][5] = 1){
                    if (tab [1][4+j] = 1);
                }
                
            }
            
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++){
                if (tab [2][3+j] = 1);
                }
                
            }
            
        //Cruzes
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++){
                if (tab [3][2] = 7) {
                    if (tab [4][0+j]=7){
                        if (tab [5][2]=7);
                    }
                }
    
            }
                
        }
        
        //Octaendros

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
                if (tab [7][5] = 8){
                    if (tab [8][4+j] = 8){
                        if (tab [9][5]=8);
                    }
                }
                
            }
        }




















        //Tabuleiro
        printf("  ");
        for (j = 0; j < 10; j++){
            printf(" %c ", let[j]);
        }
        for(i = 0; i<10; i++){
            printf("\n%d", i+1);
            for (j = 0; j < 10; j++){
                printf(" %2d", tab [i][j]);
            }
        printf("\n");
        }


    return 0;
}