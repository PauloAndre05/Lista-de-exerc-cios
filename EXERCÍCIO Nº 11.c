#include <stdio.h>
#include <math.h>

int main()
{
	int a, b, c, delta;
	float x1, x2;
	
	printf("Digite o valor de a: ");
	scanf("%i", &a);	
	printf("Digite o valor de b: ");
	scanf("%i", &b);
	printf("Digite o valor de c: ");
	scanf("%i", &c);
	
	delta = pow(b,2) - (4 * a * c);
 	
 	if (delta < 0){
		 printf("Nao e uma equacao do segundo grau");
		 printf("Delta = %i", delta);
	 }
	 else if (delta > 0)
	 {
		 x1 = - b + (sqrt(delta)) / (2 * a);
		 x2 = - b - (sqrt(delta)) / (2 * a);
	 printf("X1 = %f\n", x1);
	 printf("X2 = %f\n", x2);
	 }
	 
	 
	
	return 0;
}