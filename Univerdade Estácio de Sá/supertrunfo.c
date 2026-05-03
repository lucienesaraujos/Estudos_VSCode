# include <stdio.h>
# include <stdlib.h>

int main () {

    int menu1, menu2, rodada1, rodada2, rodada3, rodada4, rodada5, rodada6, resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;

//Carta 01  
    char carta1[]  = "Carta 01" ;
    char estado1[] = "São_Paulo";
    char codigo1[] = "A01";
    char cidade1[] = "São_Paulo";
    unsigned int populacao1 = 12325000;
    float area1 = 1521.11;
    float pib1 = 699.28;
    int turistas1 = 50; 
    float densidade1 = populacao1 / area1;
    float percapita1 = (float) (pib1*1000000000) / populacao1;

//Carta 02
    char carta2[]  = "Carta 02" ;
    char estado2[] = "Rio_de_Janeiro";
    char codigo2[] = "A02";
    char cidade2[] = "Rio_de_Janeiro";
    unsigned int populacao2 = 6748000;
    float area2 = 1200.25;
    float pib2 = 300.50;
    int turistas2 = 30;
    float densidade2 = populacao2 / area2;
    float percapita2 = (float) (pib2*1000000000) / populacao2;
    
    resultado1 = populacao1 > populacao2 ? 1 : 0;
    resultado2 = area1 > area2 ? 1 : 0;
    resultado3 = pib1 > pib2 ? 1 : 0;
    resultado4 = turistas1 > turistas2 ? 1 : 0;
    resultado5 = densidade1 < densidade2 ? 1 : 0;
    resultado6 = percapita1 > percapita2 ? 1 : 0;

    printf("*.*.* SUPER TRUNFO *.*.*\n\nBem-vindo ao jogo!\n\n_ M E N U _\n\n1. Jogar\n2. Regras\n3.Sair\n\nDigite sua escolha: "); 
    scanf("%d", &menu1);
    switch (menu1) {
    case 1: 
    printf("\nEscolha uma carta (1 a 2): ");
    scanf("%d", &menu1);
    if (menu1 == 1 ){
    printf("A cidade escolhida foi %s. Sua carta adversária será %s.\n", cidade1, cidade2);
    } else if (menu1 == 2) {
    printf("A cidade escolhida foi %s. Sua carta adversária será %s.\n", cidade2, cidade1);
    } else {
    printf("Opção inválida\n");
    }
    break;
    
    case 2:
    printf("\n1. Escolha uma cidade;\n2. Escolha qual atributo deseja comparar;\n3. Descubra se sua carta é a vencedora.\n");
    exit(0);
    break;
    
    case 3:
    printf("Saindo...\n");
    exit(0);
    break;
    
    default:
    printf("Opção inválida\n");
    exit(0);
    break;
    }
       
    printf("\nEscolha o 1º atributo para compararação\n1. População\n2. Área\n3. PIB\n4. Pontos turísticos\n5. Densidade populacional\n6. PIB percapita\nDigite sua escolha: ");
    scanf("%d", &rodada1);
    switch (rodada1) {
    case 1:
    if (rodada1 == 1 ){
    printf("\nVocê escolheu comparar 1 atributo: População\n");
    if (resultado1 = 1) {
        printf("\nA cidade %s, Venceu!\n\n", cidade1);
    } else if (resultado1 = 0){
        printf("\nA cidade %s , Venceu!\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    case 2:
    if (rodada1 == 2 ){
    printf("\nVocê escolheu comparar atributo: Área\n");
    if (resultado2 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado2 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 3:
    if (rodada1 == 3 ){
    printf("\nVocê escolheu comparar atributo: PIB\n");
    if (resultado3 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado3 = 0) {
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 4:
    if (rodada1 == 4 ){
    printf("\nVocê escolheu comparar atributos: Pontos turísticos\n");
    if (resultado4 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado4 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 5:
    if (rodada1 == 5 ){
    printf("\nVocê escolheu comparar atributo: Densidade populacional\n");
    if (resultado5 = 0) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado5 = 1){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 6:
    if (rodada1 == 6 ){
    printf("\nVocê escolheu comparar atibuto: Per capita\n");
    if (resultado6 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado6 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    default:
    printf("Opção inválida\n");
    break;
    }

    printf("\nEscolha o 2º atributo para compararação\n1. População\n2. Área\n3. PIB\n4. Pontos turísticos\n5. Densidade populacional\n6. PIB percapita\nDigite sua escolha: ");
    scanf("%d", &rodada2);
    switch (rodada2) {
    case 1:
    if (rodada2 == 1 ){
    printf("\nVocê escolheu comparar 1 atributo: População\n");
    if (resultado1 = 1) {
        printf("\nA cidade %s, Venceu!\n\n", cidade1);
    } else if (resultado1 = 0){
        printf("\nA cidade %s , Venceu!\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    case 2:
    if (rodada2 == 2 ){
    printf("\nVocê escolheu comparar atributo: Área\n");
    if (resultado2 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado2 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 3:
    if (rodada2 == 3 ){
    printf("\nVocê escolheu comparar atributo: PIB\n");
    if (resultado3 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado3 = 0) {
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 4:
    if (rodada2 == 4 ){
    printf("\nVocê escolheu comparar atributos: Pontos turísticos\n");
    if (resultado4 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado4 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break; 
    case 5:
    if (rodada2 == 5 ){
    printf("\nVocê escolheu comparar atributo: Densidade populacional\n");
    if (resultado5 = 0) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado5 = 1){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 6:
    if (rodada2 == 6 ){
    printf("\nVocê escolheu comparar atibuto: Per capita\n");
    if (resultado6 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado6 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    default:
    printf("Opção inválida\n");
    break;
    }
    printf("\nEscolha o 3º atributo para compararação\n1. População\n2. Área\n3. PIB\n4. Pontos turísticos\n5. Densidade populacional\n6. PIB percapita\nDigite sua escolha: ");
    scanf("%d", &rodada3);
    switch (rodada3) {
    case 1:
    if (rodada3 == 1 ){
    printf("\nVocê escolheu comparar 1 atributo: População\n");
    if (resultado1 = 1) {
        printf("\nA cidade %s, Venceu!\n\n", cidade1);
    } else if (resultado1 = 0){
        printf("\nA cidade %s , Venceu!\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    case 2:
    if (rodada3 == 2 ){
    printf("\nVocê escolheu comparar atributo: Área\n");
    if (resultado2 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado2 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 3:
    if (rodada3 == 3 ){
    printf("\nVocê escolheu comparar atributo: PIB\n");
    if (resultado3 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado3 = 0) {
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 4:
    if (rodada3 == 4 ){
    printf("\nVocê escolheu comparar atributos: Pontos turísticos\n");
    if (resultado4 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado4 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 5:
    if (rodada3 == 5 ){
    printf("\nVocê escolheu comparar atributo: Densidade populacional\n");
    if (resultado5 = 0) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado5 = 1){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 6:
    if (rodada3 == 6 ){
    printf("\nVocê escolheu comparar atibuto: Per capita\n");
    if (resultado6 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado6 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    default:
    printf("Opção inválida\n");
    break;
    }
   
    printf("\nEscolha o 4º atributo para compararação\n1. População\n2. Área\n3. PIB\n4. Pontos turísticos\n5. Densidade populacional\n6. PIB percapita\nDigite sua escolha: ");
    scanf("%d", &rodada4);
    switch (rodada4) {
    case 1:
    if (rodada4 == 1 ){
    printf("\nVocê escolheu comparar 1 atributo: População\n");
    if (resultado1 = 1) {
        printf("\nA cidade %s, Venceu!\n\n", cidade1);
    } else if (resultado1 = 0){
        printf("\nA cidade %s , Venceu!\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    case 2:
    if (rodada4 == 2 ){
    printf("\nVocê escolheu comparar atributo: Área\n");
    if (resultado2 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado2 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 3:
    if (rodada4 == 3 ){
    printf("\nVocê escolheu comparar atributo: PIB\n");
    if (resultado3 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado3 = 0) {
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 4:
    if (rodada4 == 4 ){
    printf("\nVocê escolheu comparar atributos: Pontos turísticos\n");
    if (resultado4 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado4 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 5:
    if (rodada4 == 5 ){
    printf("\nVocê escolheu comparar atributo: Densidade populacional\n");
    if (resultado5 = 0) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado5 = 1){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 6:
    if (rodada4 == 6 ){
    printf("\nVocê escolheu comparar atibuto: Per capita\n");
    if (resultado6 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado6 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    default:
    printf("Opção inválida\n");
    break;
}
   
    printf("\nEscolha o 5º atributo para compararação\n1. População\n2. Área\n3. PIB\n4. Pontos turísticos\n5. Densidade populacional\n6. PIB percapita\nDigite sua escolha: ");
    scanf("%d", &rodada5);
    switch (rodada5) {
    case 1:
    if (rodada5 == 1 ){
    printf("\nVocê escolheu comparar 1 atributo: População\n");
    if (resultado1 = 1) {
        printf("\nA cidade %s, Venceu!\n\n", cidade1);
    } else if (resultado1 = 0){
        printf("\nA cidade %s , Venceu!\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    case 2:
    if (rodada5 == 2 ){
    printf("\nVocê escolheu comparar atributo: Área\n");
    if (resultado2 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado2 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 3:
    if (rodada5 == 3 ){
    printf("\nVocê escolheu comparar atributo: PIB\n");
    if (resultado3 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado3 = 0) {
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 4:
    if (rodada5 == 4 ){
    printf("\nVocê escolheu comparar atributos: Pontos turísticos\n");
    if (resultado4 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado4 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 5:
    if (rodada5 == 5 ){
    printf("\nVocê escolheu comparar atributo: Densidade populacional\n");
    if (resultado5 = 0) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado5 = 1){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 6:
    if (rodada5 == 6 ){
    printf("\nVocê escolheu comparar atibuto: Per capita\n");
    if (resultado6 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado6 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break; 
    default:
    printf("Opção inválida\n"); 
    break;
    }
    printf("\nEscolha o 6º atributo para compararação\n1. População\n2. Área\n3. PIB\n4. Pontos turísticos\n5. Densidade populacional\n6. PIB percapita\nDigite sua escolha: ");
    scanf("%d", &rodada6);
    switch (rodada6) {
    case 1:
    if (rodada6 == 1 ){
    printf("\nVocê escolheu comparar 1 atributo: População\n");
    if (resultado1 = 1) {
        printf("\nA cidade %s, Venceu!\n\n", cidade1);
    } else if (resultado1 = 0){
        printf("\nA cidade %s , Venceu!\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    case 2:
    if (rodada6 == 2 ){
    printf("\nVocê escolheu comparar atributo: Área\n");
    if (resultado2 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado2 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 3:
    if (rodada6 == 3 ){
    printf("\nVocê escolheu comparar atributo: PIB\n");
    if (resultado3 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado3 = 0) {
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 4:
    if (rodada6 == 4 ){
    printf("\nVocê escolheu comparar atributos: Pontos turísticos\n");
    if (resultado4 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado4 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 5:
    if (rodada6 == 5 ){
    printf("\nVocê escolheu comparar atributo: Densidade populacional\n");
    if (resultado5 = 0) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado5 = 1){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    } 
    break;
    case 6:
    if (rodada6 == 6 ){
    printf("\nVocê escolheu comparar atibuto: Per capita\n");
    if (resultado6 = 1) {
        printf("\nA cidade %s Venceu!\n\n", cidade1);
    } else if (resultado6 = 0){
        printf("\nA cidade %s , Venceu\n\n", cidade2);
    } else{
        printf("\nAs cidades empataram!");
    }
    }
    break;
    default:
    printf("Opção inválida\n");
    break;
    }
    return 0;

}