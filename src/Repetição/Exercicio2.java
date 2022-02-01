package Repetição;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		int par=0, num, impar = 0 , i; 
		
		for (i=1; i<=10; i++) { 

		System.out.println("Informe numero: "); 
		num=id.nextInt();

		if (num%2 == 0) { 

		par++;

		}
		else
		impar++;

		}

		System.out.println("Pares:" +par); 

		System.out.println("Impares" +impar); 
		
		
	}
		}
