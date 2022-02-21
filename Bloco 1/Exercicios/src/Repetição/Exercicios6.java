package Repetição;

import java.util.Scanner;

public class Exercicios6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int soma=0, media=0, x;
		
		do
		{
			System.out.println("Digite um numero");
			x=leia.nextInt();
			
				if(x%3==0 && x!=0)
				{
					soma+=x;
					media++;
				}
		}while(x!=0);
		
		media=soma/media;
		System.out.println("A media dos numeros multiplos de 3 que você digitou é: "+media);
	}
}