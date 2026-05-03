/*# include <stdio.h>

int main (){

for (int variavel1 = 1; variavel1 <= 10; variavel1++){
    for(int variavel2 = 1; variavel2 <= 10; variavel2++){
        printf("%d x %d = %d\n", variavel1, variavel2, variavel1*variavel2);
    }
    printf("\n");
}

    return 0;
}*/


/*#include <stdio.h>
 
int main() {
    int i = 1;
    while (i <= 10) {
        int j = 1;
        while (j <= 10) {
            printf("%d\t", i * j);
            j++;
        }
        printf("\n");
        i++;
    }
    return 0;
}*/


/*#include <stdio.h>
 
int main() {
    int i = 1;
    do {
        int j = 1;
        do {
            printf("%d\t", i * j);
            j++;
        } while (j <= 10);
        printf("\n");
        i++;
    } while (i <= 10);
    return 0;
}*/





/*#include <stdio.h>
int main() {
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
            if ((i + j) % 2 == 0) {
                printf("(%d, %d)\n", i, j);
            }
        }
    }
    return 0;
}*/



/*#include <stdio.h>

int main() {
    int n = 10; // altura do triângulo
 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}*/






/*#include <stdio.h>
 
int main() {
    int segundos;
   
    for (segundos = 10; segundos >= 0; segundos--) {
        printf("%d\n", segundos);
       
        // Loop aninhado para simular um atraso
        for (int i = 0; i < 1000000000; i++) {
            // Apenas para simular um atraso
        }
    }
 
    printf("Fogos de artifício!\n");
   
    return 0;
}*/



# include <stdio.h>

int main () {

    int variavel1, variavel2;
    char letra;
    // sequencia contínua char letra = 'a'; 
      for( variavel1 = 1; variavel1 <= 5; variavel1++) {
            letra = 'A'; //sequecia que torna ao início
        for (variavel2 = 1; variavel2 <= variavel1; variavel2++){
                printf("%c", letra);
                ++letra;
        }
    printf("\n");
    }



    return 0;
}









