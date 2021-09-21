#include <stdio.h>
#include <stdlib.h>

int main()
{
	int custo, convite; 
	double q;
	
	printf("informe o custo do espetaculo: ");
	scanf("%i", &custo);
	printf("informe quanto custa um convite: ");
	scanf("%i", &convite);
	
	q = custo / convite;
	
	printf("\nEh necessario vender %lf convites para pelo menos alcançar o custo do espetaculo.\n", q);
	return 0;
}