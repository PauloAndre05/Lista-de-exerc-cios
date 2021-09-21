#include <stdio.h>
#include <stdlib.h>

int main()
{
	int SalActual, NovoSal, Aumento, ValDoAumento;
	
	printf("digite o salario do funcionario: ");
	scanf("%i", &SalActual);
	printf("informe o percentual do aumento: ");
	scanf("%i", &Aumento);
	
	ValDoAumento = (SalActual * Aumento) / 100;
	NovoSal = SalActual + ValDoAumento;
	
	printf("\nO valor do aumento eh: %i Kz \n", ValDoAumento);
	printf("O novo salario do funcionario eh: %i Kz \n", NovoSal);
	
	return 0;
}