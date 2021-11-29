
import java.util.Scanner;

public class exercicio28{

	public static void main(String[] args){

		Scanner ler = new Scanner (System.in);

		System.out.print("\nDigite o numero de horas traballhadas: ");
		int nh = ler.nextInt();

		System.out.print("Digite o salario minimo: ");
		double salMinimo = ler.nextDouble();

		double ht = salMinimo / 2;
		double salBruto = nh * ht;
		double imposto = (salBruto * 3) / 100;
		double salReceber = salBruto - imposto;

		System.out.println("O salario a receber eh: "+salReceber);

}

}