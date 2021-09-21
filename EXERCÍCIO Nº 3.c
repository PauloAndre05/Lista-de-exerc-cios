#include <stdio.h>
#include <stdlib.h>

int main()
{
	int AnoDeNascimento, AnoActual, idade,  c;
	
	printf("digite o seu ano de nascimento: ");
	scanf("%i", &AnoDeNascimento);
	printf("digite o ano actual: ");
	scanf("%i", &AnoActual);
	
	idade = AnoActual - AnoDeNascimento;
	c = 2050 - AnoDeNascimento;
	
	printf("\nA sua idade eh %i anos \n", idade);
	printf("Em 2050 vc tera %i anos \n", c);
	
	return 0;
}