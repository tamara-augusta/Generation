package Excecicios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main (String args [] ) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Escreva o número: ");
		a = ler.nextDouble();
		
		System.out.println("Escreva o número: ");
		b = ler.nextDouble();
		
		System.out.println("Escreva o número: ");
		c = ler.nextDouble();
		
		System.out.println("Escreva o número: ");
		d = ler.nextDouble();
		
		System.out.println("Escreva o número: ");
		e = ler.nextDouble();
		
		System.out.println("Escreva o número: ");
		f = ler.nextDouble();
		
		x = ( (c*e)-(b*f) ) / ( (a*e)-(b*d) );
		y = ( (a*f)-(c*d) ) / ( (a*e)-(b*d) );
		
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("O valor do x: " + df.format(x));
		System.out.println("O valor do y: " + df.format(y));
		
		
	}
	
}