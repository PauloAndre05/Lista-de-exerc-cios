#include <stdio.h>
#include <stdlib.h>

int main()
{
	
	int cont, numero, ContPar = 0, ContImpar = 0, SomaPar = 0, SomaImpar = 0;
	float MediaPar = 0, MediaImpar = 0;
	for (cont = 0; cont < 10; cont++){
		
		printf("informe um valor: ");
		scanf("%i", &numero);
		
		if (numero % 2 == 0){
			ContPar ++;
			SomaPar += numero;
		}else
		{
			ContImpar ++;
			SomaImpar += numero;	
		}
		
	}
	
	MediaPar = SomaPar / ContPar;
	MediaImpar = SomaImpar / ContImpar;
	
	printf("\nA media dos numeros pares eh: %f", MediaPar);
	printf("\nA media dos numeros impares eh: %f", MediaImpar);
	return 0;
}