# include <stdio.h>

int main () {

/*    int i = 1;
   
    do {
        printf("%d\n", i);
        i++;
    } while (i <= 5);
     */







/*int variavel = 1;

do {
    printf("%d......................\n", variavel);
    
    variavel++;
} while (variavel <= 10);*/

int num;

do {
        printf("Digite um número (negativo para sair): ");
        scanf("%d", &num);
       
        if (num >= 0) {
            printf("Você digitou: %d\n", num);
        }
    } while (num >= 0);
   
    printf("Número negativo detectado. Saindo...\n");
   
    







return 0;

}