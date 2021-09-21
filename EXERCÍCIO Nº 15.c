#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a = 0, numero;
	
	do{
		
		
		printf("digite um numero: ");
		scanf("%i", &numero);
		if (numero >=  0){ 
		printf("O sucessor do numero %i eh: %i \n\n", numero, numero + 1);
		}
		a++;
		
	}while(numero >= 0);
	
	printf("\n\n\t\t\tO programa terminou porque vc digitou um numero negativo! %i\n\n", numero);
	
	return 0;
}