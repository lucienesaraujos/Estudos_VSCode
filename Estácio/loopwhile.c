# include <stdio.h>

/*int main() {
    int i = 1;
   
    while (i <= 5) {
        printf("%d\n", i);
        i++;
    }
   
    return 0;
}*/





/*int main (){

    int variavel = 10;
    
    while (variavel <= 20){

    printf("%d ______________________\n", variavel);
    variavel++;
    }*/

    #include <stdio.h>
 
int main() {
    /*int num;
   
    printf("Digite um número (negativo para sair): \n");
    scanf("%d", &num);
   
    while (num >= 0) {
        printf("Você digitou: %d\n", num);
       
        printf("Digite um número (negativo para sair): \n");
        scanf("%d", &num);
    }
   
    printf("Número negativo detectado. Saindo...\n");*/

    int option;
     do {
        printf("Menu:\n");
        printf("1. Opção 1\n");
        printf("2. Opção 2\n");
        printf("3. Sair\n");
        printf("Escolha uma opção: \n");
        scanf("%d", &option);
       
        switch(option) {
            case 1:
                printf("Você escolheu a opção 1\n");
                break;
            case 2:
                printf("Você escolheu a opção 2\n");
                break;
            case 3:
                printf("Saindo...\n");
                break;
            default:
                printf("Opção inválida!\n");
        }
    } while (option != 3);
   
   
    return 0;
}
  

















