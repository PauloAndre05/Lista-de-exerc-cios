#include <stdio.h>
#include <stdlib.h>

int main()
{
	
	float peso, quantidade, resto;
	
	printf("Digite o peso do saco de racao: ");
	scanf("%f", &peso);
	printf("digite a quantidade cada gato: ");
	scanf("%f", &quantidade);
	
	resto = peso - (((quantidade * 2) / 1000) * 5);
	
	printf("Apos cinco dias, restara no saco de racao %f kg", resto);
	
	return 0;
}