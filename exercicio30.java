import java.util.Scanner;

public class exercicio30{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
	
		System.out.print("\nDigite o peso do saco de racao: ");
		float peso = ler.nextFloat();

		System.out.print("digite a quantidade cada gato: ");
		float quantidade = ler.nextFloat();
	
		float resto = peso - (((quantidade * 2) / 1000) * 5);
	
		System.out.println("Apos cinco dias, restara no saco de racao: "+resto);

}

}

