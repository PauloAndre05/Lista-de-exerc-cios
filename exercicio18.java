

import java.util.Scanner;

public class exercicio18{

	public static void main(String[] args){

		double preco, newPreco; 
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o preco do produto: ");
		preco = ler.nextDouble();
	
		newPreco = preco - (preco * 10) / 100;

		System.out.println("\npreco do produto: "+preco);
		System.out.println("Desconto: "+newPreco);
			
		

}

}