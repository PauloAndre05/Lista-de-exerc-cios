//23 – Faça um programa em Java que receba o peso de uma pessoa, calcule e mostre: 
//a) o novo peso, se a pessoa engordar 15% sobre o peso digitado;  
//b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado

import java.util.Scanner;

public class exercicio23{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		double peso = ler.nextDouble();
		
		double novoPeso = peso + (peso * 15) / 100;
		double novoPeso1 = peso - (peso * 20) / 100;

		System.out.println("Se a  pessoa engordar 15% o seu peso sera: "+novoPeso);
		System.out.println("Se a  pessoa emagrecer 20% o seu peso sera: "+novoPeso1);

}

}