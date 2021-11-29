//8 – Faça um programa em Java que calcule e mostre a área de um quadrado. 
//Sabe-se que: A = lado * lado. 

import java.util.Scanner;
public class exercicio8{

	public static void main(String[] args){

	Scanner	ler = new Scanner(System.in);
	
	System.out.print("Digite o primeiro lado: ");
	float lado1 = ler.nextFloat();

	System.out.print("Digite o primeiro lado: ");
	float lado2 = ler.nextFloat();

	System.out.print("A area do quadrado eh = "+(lado1 * lado2));

}

}