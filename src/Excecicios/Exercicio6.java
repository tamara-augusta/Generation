package Excecicios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main (String args [] ) {
		
		double custoAoConsumidor,
		       custoDeFabrica,
		       valorDoDistribuidor,  
		       percentualDistribuidor = 28.0, 
		       impostos = 45.0,
		       valorDoImpostos;
		
		
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		
		System.out.println("Custo de fábrica: ");
		custoDeFabrica = ler.nextDouble();
		
		valorDoDistribuidor = (custoDeFabrica * percentualDistribuidor) / 100;
		valorDoImpostos = (custoDeFabrica * impostos) / 100;
		custoAoConsumidor = custoDeFabrica + valorDoDistribuidor + valorDoImpostos;
		
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("O custo para o consumudor é de: " + df.format(custoAoConsumidor));
		
			
	}

}