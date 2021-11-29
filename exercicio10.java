//10 – Faça um programa em Java que calcule e mostre a área de um trapézio. 
//Sabe-se que: A = ((base maior + base menor) * altura) /2

import java.util.Scanner;

public class exercicio10{

	public static void main(String[] args){

	Scanner ler = new Scanner(System.in);

	float a;
	
	System.out.print("Digite a base maior: ");
	float baseMaior = ler.nextFloat();

	System.out.print("Digite a base menor: ");
	float baseMenor = ler.nextFloat();

	System.out.print("Digite a altura: ");
	float altura = ler.nextFloat();
	
	a = ((baseMaior + baseMenor) * altura) / 2;

	System.out.println("A area do trapezio eh = "+a);

}

}