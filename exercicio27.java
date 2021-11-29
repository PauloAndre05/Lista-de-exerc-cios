

import java.util.Scanner;

public class exercicio27{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o preco de fabrico: ");			
		double precoFabrica = ler.nextDouble();

		System.out.print("Digite a percentagem de lucro: ");
		double percLucro = ler.nextDouble();
		

		System.out.print("Digite a percentagem de impostos: ");
		double percImpostos = ler.nextDouble();
		
		double lucro = (precoFabrica * percLucro) / 100;
		double imposto = (precoFabrica * percImpostos) / 100;
		double custo = precoFabrica + lucro +imposto;

		System.out.println("\nO valor correspondente ao lucro do distribuidor eh: "+lucro);
		System.out.println("O valor correspondente aos impostos eh: "+imposto);
		System.out.println("O preço final do veículo eh: "+custo);

}

}