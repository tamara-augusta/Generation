package Excecicios;

import java.util.Scanner;



public class Exercicio3 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int horas, minutos, segundos, seg;

		System.out.println("Tempo do evento em segundos? ");
		segundos = ler.nextInt();
		
				
		horas=(segundos/3600);
		minutos=((segundos/3600)/60);
		seg=(segundos%3600%60)%60; 
		
				
		System.out.println("Final:" +horas + "horas" + segundos  + "segundo" +  minutos  + "minutos" + seg + "Segundos");	
	}

}
