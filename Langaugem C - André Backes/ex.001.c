#include <stdio.h>
#include <stdlib.h>
   /* float soma (float a, float b) {return a+b;}
    float subtracao (float a, float b) {return a-b;}
    float multiplicacao (float a, float b) {return a*b;}
    float divisao (float a, float b) {return a/b;}*/

int main () {
    
   /* float x,y,z;
    char ch;
    printf("Digite uma operação matemática: ");
    ch = getchar();
    printf("Digite 2 números: ");
    scanf("%f %f", &x, &y);

    switch (ch)
    {
    case '+': z = soma (x,y); break;
    case '-': z = subtracao (x,y); break;
    case '*': z = multiplicacao (x,y); break;
    case '/': z = divisao (x,y); break;
    default: printf("Opção inválida\n"); break;
    }
    printf("Resultado = %.2f\n", z);*/

    
    int num1, num2, num3;
    printf("Digite a data do seu aniversário: ");
    scanf("%d /%d /%d", &num1, &num2, &num3);
    printf("Parabéns no dia \"%d/%d/%d\" será enviado \b para o seu e-mail um \f presente especial ;)\n", num1, num2, num3);




    return 0;
}