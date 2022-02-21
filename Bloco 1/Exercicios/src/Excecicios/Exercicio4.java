
package Excecicios;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;



public class Exercicio4 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		double a, b, c, r, s, d;
		

		System.out.println("digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("digite o valor de C: ");
		c = ler.nextDouble();
		
				
		r=Math.pow ((a+b),2);	
		s=Math.pow ((b+c),2);
		d= (r+s)/2;
				
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println(df.format(d));
	}
	       
	 
}