//22 – Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.
//Faça um programa em Java que receba o salário fixo do funcionário e o valor de suas vendas, 
//calcule e mostre a comissão e seu salário final. 

import java.util.Scanner;

public class exercicio22{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o salario fixo: ");
		double salFixo = ler.nextDouble();

		System.out.print("Informe o valor de suas vendas: ");
		double valorVenda = ler.nextDouble();
	
		double comissao = valorVenda + (valorVenda * 4) / 100;
	
		System.out.println("A comissao eh: "+comissao);
		System.out.println("O salario final eh: "+(comissao + salFixo));

}

}