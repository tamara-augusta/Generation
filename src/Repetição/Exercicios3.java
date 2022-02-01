package Repetição;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
	Scanner id=new Scanner(System.in);
	int idade, contador21=0, contador50=0;
	
	System.out.println("Digite a sua idade: ");
	idade=id.nextInt();
	
	while(idade!=99) 
	{
		if(idade<21)
			contador21++;
		if(idade>50)
			contador50++;
		System.out.println("(para encerrar digiti -99)\n digiti a idade: ");
		idade=id.nextInt();
	}
       System.out.println("\nO total de pessoas com menos de 21 anos é: "+contador21);
       System.out.println("\nO total de pessoas com mais de 50 anos é: "+contador50);
	}

}
