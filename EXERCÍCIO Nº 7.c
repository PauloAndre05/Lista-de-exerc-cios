#include <stdio.h>
#include <stdlib.h>

int main()
{
	int PrecoDaFabrica, PercLucro, PercImposto, ValLucro,
	ValImposto, PrecoFinal; 
	
	printf("Informe o preco de fabrica: ");
	scanf("%d", &PrecoDaFabrica);
	printf("Informe o percentual de lucro: ");
	scanf("%i", &PercLucro);
	printf("Informe o percentual dos impostos: ");
	scanf("%d", &PercImposto);
	
	ValLucro = (PrecoDaFabrica * PercLucro) / 100;
	ValImposto = (PrecoDaFabrica * PercImposto) / 100;
	PrecoFinal = PrecoDaFabrica + ValLucro + ValImposto;
	
	printf("\nO valor correspondente ao lucro do distribuidor eh: %d Kz \n", ValLucro);
	printf("O valor correspondente aos impostos eh: %d Kz \n", ValImposto);
	printf("O Preco final do veiculo eh: %d Kz \n", PrecoFinal);
	
	return 0;
}