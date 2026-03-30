# include <stdio.h>

int main (){
//Variáveis usadas
    int menu, jogo, torre = 1, bispo = 1, rainha = 1, cavalo1 = 1, cavalo2 = 1;
    char d1 [] = "Direita", e1 [] = "Esquerda", c1 [] = "Para cima", b1 [] = "Para baixo";
    
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
//Repetição while
    while (torre <= 5) {
        printf("%s\n", d1);
        torre++;
    }
    break;
    case 'B':
    case 'b':
//Repetição do-while
    do
    {
    printf("%s e %s\n", d1,c1);
    bispo++;
    } while (bispo <=5);
    break;
    case 'D':
    case 'd':
//Repetição for
    for (rainha = 1; rainha <= 8; rainha++)
    {
        printf("%s\n", e1);
    }
    break;
//Repetição loop aninhado for
    case 'C':
    case 'c':
    for (cavalo1 = 1; cavalo1 <= 1; cavalo1++)
    {   
        for (cavalo3 = 1; cavalo2 <= 1; cavalo2++)
        {
        printf("%s\n%s\n", b1, b1);
        }
    printf("%s\n%s\n", e1, e1);
    }   
    }
    break;
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