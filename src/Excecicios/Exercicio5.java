package Excecicios;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;



public class Exercicio5 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		double nota1, nota2, nota3, media;
				

		System.out.println("Digita notas: ");
		nota1 = ler.nextDouble();
				
		System.out.println("Digita notas: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digita notas: ");
		nota3 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;	
		
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("Media:" + df.format(media));
	}

}