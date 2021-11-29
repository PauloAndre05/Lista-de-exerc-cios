
import java.util.Scanner;

public class exercicio16{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		float p, j;
		double m;	
		System.out.print("Digite o pes: ");
		float pes = ler.nextFloat();
		
		p = (pes * 12) / 1;
		j = (pes * 1) / 3;
		m = (j * 1) / 1.760;

		System.out.println("Polegadas: "+p);
		System.out.println("Jardas: "+j);
		System.out.println("Milhas: "+m);

	}

}