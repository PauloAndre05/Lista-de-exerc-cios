//12 – Faça um programa em Java que calcule e mostre a área de um triângulo.
//Sabese que: Área = (base * altura) /2.

import java.util.Scanner;

public class exercicio12{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a base: ");
		float base = ler.nextFloat();
		
		System.out.print("Digite a altura: ");
		float altura = ler.nextFloat();

		float area = (base * altura) / 2;

		System.out.println("A area deste triangulo eh = "+area);
}

}