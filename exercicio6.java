

import java.util.Scanner;

public class exercicio6{

public static void main(String[] args){

Scanner ler = new Scanner(System.in);

System.out.println("Informe a primeira nota: ");
double n1 = ler.nextDouble();
System.out.println("Informe o primeiro peso: ");
double p1 = ler.nextInt();

System.out.println("Informe a segunda nota: ");
double n2 = ler.nextDouble();
System.out.println("Informe o segundo peso: ");
double p2 = ler.nextInt();


System.out.println("Informe a terceira nota: ");
double n3 = ler.nextDouble();
System.out.println("Informe o terceiro peso: ");
double p3 = ler.nextInt();

double mediaPonderada;
mediaPonderada = ((n1 * p1) + (n2 * p2) + (n3 * p3))/ (p1 + p2 + p3);

System.out.println("A media ponderada eh = "+mediaPonderada);

}

}