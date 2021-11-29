//17 – Faça um programa em Java que receba o salário de um funcionário, 
//calcule e mostre o novo salário, 
//sabendo-se que este sofreu um aumento de 25%.

import java.util.Scanner;

public class exercicio17{

	public static void main(String[] args){

		double salFuncionario, newSal; 
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o salario do funcionario: ");
		salFuncionario = ler.nextDouble();
	
		newSal = salFuncionario + (salFuncionario * 25) / 100;

		System.out.println("Salario actual: "+salFuncionario);
		System.out.println("Com o aumento de 25 porcento o seu salario sera de: "+newSal);
			
		

}

}