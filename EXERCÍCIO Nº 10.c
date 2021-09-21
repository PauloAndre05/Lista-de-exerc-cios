#include <stdio.h>
#include <stdlib.h>

int main()
{
	int quilowatt, SalMinimo, vq, vr, vc;
	
	printf("Informe o salario minimo: ");
	scanf("%i", &SalMinimo);
	printf("Informe o quilowatt: ");
	scanf("%i", &quilowatt);
	
	
	vq = SalMinimo / 5;
	vr = quilowatt * vq;
	vc = vr - (vr * 15) / 100;

	printf("\nO valor de cada quilowatt eh: %i \n", vq);
	printf("O valor a ser pago por essa residencia eh de: %i \n", vr);
	printf("O valor a ser pago com desconto de 15 porcento eh: %i \n", vc);	
	
	return 0;
}