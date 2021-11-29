import java.util.Scanner;

public class exercicio5{

public static void main(String[] args){

	Scanner ler = new Scanner(System.in);
	System.out.println("Digite a primeira nota: ");
	int nota1 = ler.nextInt();

	System.out.println("Digite a segunda nota: ");
	int nota2 = ler.nextInt();

	double media = (nota1 + nota2) / 2;
	System.out.println("A media eh = :" +media);
	
}


}