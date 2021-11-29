//24 – Faça um programa em Java que receba o salário base de um funcionário, 
//calcule e mostre seu salário a receber, sabendo-se que o funcionário tem gratificação de R$ 50 
//e paga imposto de 10% sobre o salário base. 

import java.util.Scanner;

public class exercicio24{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
	
		System.out.print("Digite o salario base: ");
		double salBase = ler.nextDouble();

		double salReceber = salBase - (salBase * 10) / 100;

		System.out.println("O salario a receber eh: "+(salReceber + 50));
}

}