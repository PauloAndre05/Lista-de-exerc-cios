//7 – Faça um programa em Java que calcule e mostre a área de um losango. 
// Sabe-se que: A = (diagonal maior * diagonal menor) /2. 

import java.util.Scanner;
public class exercicio7{

public static void main(String[] args){

float a;
Scanner ler = new Scanner(System.in); 

System.out.print("Informe a diagonal maior: ");
float diagoMaior = ler.nextFloat();

System.out.print("Informe a diagonal menor: ");
float diagoMenor = ler.nextFloat();

a = (diagoMaior * diagoMenor) / 2;

System.out.println("\nA area do losango eh = "+a);


}

}