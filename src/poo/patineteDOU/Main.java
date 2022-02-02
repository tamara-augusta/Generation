package poo.patineteDOU;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		String marca,cor,tamanho;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite cor: ");
		cor=ler.nextLine();
		
		System.out.print("Digite marca: ");
		marca=ler.next();
		
		System.out.print("Digite a tamanho ");
		tamanho=ler.next();
		
		Patinete patinete  = new Patinete (marca,tamanho,Integer.parseInt(cor));
		patinete.status();
				
	}

}