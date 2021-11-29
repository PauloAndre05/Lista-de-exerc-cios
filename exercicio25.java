//25 – Faça um programa em Java que receba o valor de um depósito e o valor da taxa de juros,
//calcule e mostre o valor do rendimento e o valor total depois do rendimento.

import java.util.Scanner;

public class exercicio25{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite o valor de deposito: ");
		double deposito = ler.nextDouble(); 

		System.out.print("Digite a taxa de juros: ");
		double juros = ler.nextDouble();
	
		System.out.println("\nO rendimeto eh: "+juros);
		System.out.println("O valor total eh: "+(deposito + juros));

}

}