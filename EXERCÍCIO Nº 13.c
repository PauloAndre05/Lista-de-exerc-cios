#include <stdio.h>
#include <stdlib.h>

int main()
{
	
	int cont, soma = 0;
	
	for (cont = 1; cont <= 500; cont ++){
		
		if(cont % 2 != 0 && cont % 3 == 0){
			soma += cont;
		} 
		;
	}
	printf("\nA soma dos impares multiplos de 3 eh: %i\n", soma);
	return 0;
}