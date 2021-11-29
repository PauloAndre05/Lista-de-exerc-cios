//15 – Faça um programa em Java que receba dois números maiores que zero, 
//calcule e mostre um elevado ao outro.

import java.util.Scanner;


public class exercicio15{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = ler.nextInt();

		System.out.print("Digite o segundo numero: ");
		int n2 = ler.nextInt();

		int r1 = math.pow(n1,n2);
		int r2 = math.pow(n2,n1);

		System.out.println("O resultado do primeiro numero elevado ao segundo eh = "+r1);
		System.out.println("O resultado do segundo numero elevado ao primeiro eh = "+r2);

}

}