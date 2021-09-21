#include <stdio.h>
#include <stdlib.h>

int main()
{
	double SalMinimo, SalActual;
	int q;
	
	
	printf("Informe o salario minimo: ");
	scanf("%lf", &SalMinimo);
	printf("Informe o salario do funcionario: ");
	scanf("%lf", &SalActual);
	
	q = SalActual / SalMinimo;
	printf("\n A quantidade de salarios minimos que esse fucionario ganha eh %d\n", q);
		
	return 0;
}