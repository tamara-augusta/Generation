package Excecicios;


import java.util.Scanner;



public class Exercicio8 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double cf, dist, imp, cc;
		

		System.out.println("Entre com o valor de F�brica do ve�culo: ");
		cf = ler.nextDouble();
		

		dist=cf*0.28;
		imp=cf*0.45;
		cc=cf+dist+imp;
				
		System.out.println(cc);
	}

}