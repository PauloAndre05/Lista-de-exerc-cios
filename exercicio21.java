//21 – Faça um programa em Java que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
//sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% também sobre o salário base. 

import java.util.Scanner;

public class exercicio21{

	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite o salario do funcionario: ");
		double salF = ler.nextDouble();
	
		double salReceber = salF + (salF * 5) / 100;
       	        salReceber =  salReceber - ( salReceber * 7) / 100;
		
		System.out.println("\nO salario a receber eh: "+ salReceber);
	

}

}