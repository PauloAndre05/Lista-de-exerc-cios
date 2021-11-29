//11 – Faça um programa em Java que receba o valor do salário mínimo e o valor do salário de um funcionário, 
//calcule e mostre a quantidade de salários mínimos que esse funcionário ganha.

import java.util.Scanner;

public class exercicio11{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite o salario minimo: ");
		double salMinimo = ler.nextDouble();

		System.out.print("Digite o salario do funcionario: ");
		double salF = ler.nextDouble();
		
		double quantidade = salF / salMinimo;

		System.out.println("A quantidade de salarios minimo que o funcionario ganha eh: "+quantidade);

}

}