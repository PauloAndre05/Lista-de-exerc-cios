#include <stdio.h>
#include <stdlib.h>

int main()
{
	float AlturaChico = 1.50, AlturaJuca = 1.10;
	int a = 0, ContadorJuca = 0;
	do {
		a++;
		AlturaChico += 0.02;
		
		AlturaJuca  += 0.03;
		
		ContadorJuca ++;
		
	}while (AlturaChico > AlturaJuca);
	printf("\n\n\t\t\tSerao necessario %d anos para que o Juca seja maior que Chico\n", ContadorJuca);
	printf("\n\t\t\t\tAltura do Chico depois de %i anos sera %f\n", ContadorJuca, AlturaChico);
	printf("\t\t\t\tAltura do  Juca depois de %i anos sera %f\n", ContadorJuca, AlturaJuca);

	return 0;
}






















