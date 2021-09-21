#include <stdio.h>
#include <stdlib.h>

int main()
{
	int valor, contador	, r = 1;
	
	printf("Digite um numero: ");
	scanf("%i", &valor);
	
	for(contador = valor ; contador >= 1; contador--)
	{	
		
		printf("%i x ", contador);	
		r *= contador;
	}
	printf(" = %i", r);
	
	return 0;
}