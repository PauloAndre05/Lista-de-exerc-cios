#include <stdio.h>
#include <stdlib.h>

int main()
{
	
	int HorasTrabalhadas, SalMinimo, ht, sb, imposto, SalReceber;
	
	printf("Digite o salario minimo: ");
	scanf("%i", &SalMinimo);
	
	printf("Digite o numero de horas trabalhadas: ");
	scanf("%i", &HorasTrabalhadas);
	
	ht = SalMinimo / 2;
	sb = HorasTrabalhadas * ht;
	imposto = (sb * 3) / 100;
	SalReceber = sb - imposto;
	
	printf("\nHora trabalhada: %i \n", ht);
	printf("Salario Bruto: %i \n", sb);
	printf("Imposto: %i \n", imposto);
	
	printf("\nO salario a receber eh de: %i \n", SalReceber);
	
	return 0;
}