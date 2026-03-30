# include <stdio.h>
# include <stdlib.h>

void rectorre (int numero) {
if (numero > 0) {
rectorre (numero - 1);
printf("Direita\n", numero);
    }
}

void recbispo1 (int numero) {
    if (numero > 0) {
        recbispo1 (numero - 1);
        printf ("Para cima\n");
        }
    }

void recbispo2 (int numero) {
    if (numero > 0 ){
        recbispo2 (numero - 1);
        printf ("Direita\n");
    }
}

void recrainha (int numero) {
    if (numero > 0) {
        recrainha (numero - 1);
        printf ("Esquerda\n");
    }
}

int main () {
//Variáveis usadas
    int menu, jogo, torre, bispo, rainha, cavalo1, cavalo2;
    
    
//Menu de boas-vindas - Parte 1
    printf("Bem-vindo ao jogo de Xadrez em C\n");
    printf("Menu\n1. Jogar\n2. Regras e Movimentos\n3.Sair\nDigite sua escolha: ");
    scanf("%d", &menu);
    switch (menu) {    
    case 1:
    printf ("Escolha qual peça deseja mover\nT. Torre\nB. Bispo\nD. Rainha\nC. Cavalo\nDigite a sua escolha: ");
    scanf("%s", &jogo);
    
//Menu do jogo
    switch (jogo){
    case 'T':
    case 't':
//Recursivo Torre
    printf("Movendo Torre\n");
    rectorre (5);
    break;
//Recursivo Bispo
    case 'B':
    case 'b':
    printf("Movendo Bispo\n");
    recbispo1 (5); {
    recbispo2 (5);
    }
    break;
//Recursivo Rainha
        case 'D':
        case 'd':
        printf("Movendo Rainha\n");
        recrainha (8);
    break;
//Repetição loop aninhado Cavalo
    case 'C':
    case 'c':
    for (cavalo1 = 1; cavalo1 <= 3; cavalo1++)
    {   if (cavalo1 == 3) break;
            printf("Para Cima\n");
            }
    for (cavalo2 = 1; cavalo2 <= 2; cavalo2++)
    {    if (cavalo2 > 0) {
            printf ("Direita\n");
        } 
    } 
    break;
    default:
    printf("Opção inválida\n");
    break;
    }
    exit (0);
    
    //Menu de boas-vindas - Parte 2
    case 2:
    printf("Regras e Movimentos\n1. Você só pode mover uma peça por vez;\n2. A peça torre sempre se move em linha reta;\n3. A peça Bispo sempre se move em linha diagonal;\n4. A peça Rainha move em todas as direções sem restrições.\n");
    break;
    exit(0);

    case 3:
    printf("Saindo...\n");
    break;
    exit(0);

    default:
    printf("Opção inválida\n");
    break;
    exit(0);
    }
    
    return 0;
}