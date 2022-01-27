package Excecicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, resp;		
		
		System.out.println("Quantos anos você tem? ");
		anos = ler.nextInt();
				
		System.out.println("Quantos meses você tem? ");
		meses = ler.nextInt();
		
		System.out.println("Quantos dias você tem? ");
		dias = ler.nextInt();
				
		resp=(anos*365)+(meses*30)+dias;
		
		System.out.println(resp);
		
	}

}
