#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{

	char nome[50] ;
	float dias, txd, lucro;
	int hotel=1, somaganho = 0;
	while(hotel <= 30)
	{
		
		printf("\nDigite o nome: ");
		scanf("%s", &nome);
		printf("Digite quantos dias esta no hotel: ");
		scanf("%f", &dias);
		
		if (dias < 15){
			lucro = 4;
			txd = 50 + lucro;
			printf("\nNome: %s\n", nome);
			printf("Total: %f\n", txd);
		}
		else if(dias == 15)
		{
			lucro = 3.60;
			txd = lucro;
			printf("Nome: %s\n", nome);
			printf("Total: %f\n", txd);
		}
		if(dias > 15){
			lucro = 3;
			txd = 50 + lucro;
			printf("Nome: %s\n", nome);
			printf("Total: %f\n\n", txd);
		}
		somaganho += txd;
		++hotel;
	}
	printf("O total ganho pelo hotel eh: %i", somaganho);
	
	
	return 0;
}