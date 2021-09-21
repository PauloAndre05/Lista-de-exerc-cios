#include <stdio.h>
#include <stdlib.h>

int main()
{
	float  altura, maior = 0, menor = 0;
	int   a = 0;
	
	while(a < 15)
	{
		printf("Digite a altura: ");
		scanf("%f", &altura);
		
		if (a == 1){
			maior = altura;
			menor = altura;
		}else if(altura > maior)
		{
			maior = altura;	
		}else if(altura < menor)
		{
			menor = altura;
		}
		
		a ++;
	}	
	printf("\nMenor altura do grupo: %f\n",menor);
	printf("\nMaior altura do grupo: %f\n",maior);
	return 0;
}