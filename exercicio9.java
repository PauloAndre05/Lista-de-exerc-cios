//9 – Faça um programa em Java que receba o peso de uma pessoa em quilos, 
//calcule e mostre esse peso em gramas. 

import java.util.Scanner;

public class exercicio9{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um peso em quilos: ");
		float peso = ler.nextFloat();

		System.out.println("O peso digitado equivale a "+(peso * 1000));		

}

}