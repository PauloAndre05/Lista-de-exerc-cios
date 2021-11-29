import java.util.Scanner;

public class exercicio31{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
		double vq, vr, vc;
	
		System.out.print("Informe o salario minimo: ");
		double SalMinimo = ler.nextDouble();

		System.out.print("Informe o quilowatt: ");
		double quilowatt = ler.nextDouble();
	
		vq = SalMinimo / 5;
		vr = quilowatt * vq;
		vc = vr - (vr * 15) / 100;

		System.out.println("\nO valor de cada quilowatt eh: "+vq);
		System.out.println("O valor a ser pago por essa residencia eh de: "+vr);
		System.out.println("O valor a ser pago com desconto de 15 porcento eh: "+vc);	

}

}