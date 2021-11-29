 

import java.util.Scanner;

public class exercicio20{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do custo do espetaculo teatral: ");
		double  valor_de_custo_teatral = ler.nextDouble();  

		System.out.print("Informe o preco de convite: ");
		double  preco_de_convite = ler.nextDouble(); 
		
		System.out.println("\nA quantidade de convites que devem ser vendidos para alcancar o custo do espetaulo eh: "+(valor_de_custo_teatral / preco_de_convite));
		

}

}