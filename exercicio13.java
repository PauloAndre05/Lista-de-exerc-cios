//13 – Faça um programa em Java que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:  
//a) a idade dessa pessoa;  b) quantos anos ela terá em 2050. 

import java.util.Scanner;


public class exercicio13{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o ano actual: ");
		int anoActual = ler.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = ler.nextInt();
		
		System.out.println("A sua idade eh: "+(anoActual - anoNascimento));
		System.out.println("A sua idade em 2050 sera: "+(2050 - anoNascimento));

}

}