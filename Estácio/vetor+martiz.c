#include <stdio.h>

int main () {

    int index;

    char *alunos [3][3] = {
        {"Aluno 1 - Maria", "Português: 9", "Matemática: 7,5"},
        {"Aluno 2 - Ana", "Português: 5,5", "Matemática: 4,5"},
        {"Aluno 3 - José", "Português: 7", "Matemática: 8"}
    };

    printf("Consultar as notas\n0. Aluno 1\n1. Aluno 2\n2. Aluno 3\nDigite o código do aluno: ");
    scanf("%d", &index);
    printf("As notas do %s são: %s; %s.\n", alunos[index][0], alunos[index][1], alunos[index][2]);

    return 0;
}