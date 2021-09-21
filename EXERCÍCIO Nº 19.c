#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a = 0, s, n = 0, n2 = 1;
	
	s = n + n2;
	printf("%d %d %d", n, n2, s);
	do {
	a++;
		n = s;
		s = n + n2;
		n2 = n;
		
		printf(" %d", s);
	} while(s != 21);
	printf("\n");
	system("pause");
	
	return 0;
}