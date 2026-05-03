# include <stdio.h>

int main (){

/*int variavel = 0;

while (variavel <= 10) {
if (variavel % 2 == 0) {
printf("O número %d é par!\n", variavel);
}
    variavel++;
}

// opção para impar
while (variavel <= 10) {

if (variavel % 2 != 0) {
printf("O número %d é ímpar!\n", variavel);
}
    variavel++;
}*/

/*int numero;

do {
    printf("Digite um numero par para sair do programa: ");
    scanf("%d", &numero);

    if(numero % 2 == 0) {
        printf("O numero %d é par\n", numero);
    } else {
        printf("O numero %d é impar!\n", numero);
        }
} while (numero % 2 == 1);
// ou !=0
    printf("Você digitou um numero par. Saindo do programa......\n");*/

    int numero, variavel;

    printf ("Digite um número para calcular a tabuada: ");
    scanf ("%d", &numero);
    for (variavel = 0; variavel <=12; variavel++)
    {
        printf("%d x %d = %d\n", variavel, numero, variavel * numero);
    }
    

    return 0;

}