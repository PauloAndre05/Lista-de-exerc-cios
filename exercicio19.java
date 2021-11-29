

import java.util.Scanner;

public class exercicio19{

	public static void main(String[] args){

		double salFuncionario, newSal; 
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o salario do funcionario: ");
		salFuncionario = ler.nextDouble();

		System.out.print("Digite o percentual do aumento: ");
		double aumento = ler.nextDouble();
	
		newSal = salFuncionario + (salFuncionario * aumento) / 100;

		System.out.println("\nPercentual do aumento: "+aumento);
		System.out.println("Novo salario: "+newSal);
			
		

}

}