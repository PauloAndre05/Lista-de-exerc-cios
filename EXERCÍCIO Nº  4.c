#include <stdio.h>
#include <stdlib.h>

int main()
{
	int SalActual, NovoSal;
	
	printf("Informe o salario do funcionario: ");
	scanf("%i", &SalActual);
	
	NovoSal = SalActual + (SalActual * 25) / 100;
	
	printf("\nO seu salario actual eh: %i Kz \n", SalActual);
	printf("Com o aumento de 25 porcento vc vai receber: %i Kz \n", NovoSal);
	 
	return 0;
}