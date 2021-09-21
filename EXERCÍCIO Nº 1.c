#include <stdio.h>

int main()
{
	int l1, l2, a;
	
	printf("Digite os lados: \n");
	scanf("%i%i", &l1, &l2);
	
	a = l1 * l2;
	
	printf("a area desse quadrado eh: %d", a);
	return 0;
}