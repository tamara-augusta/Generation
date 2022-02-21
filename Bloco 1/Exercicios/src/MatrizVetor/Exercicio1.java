package MatrizVetor;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		float[] vetor;
		float maior;
		try (Scanner ler = new Scanner(System.in)) {
			while (true) 
			{
				vetor = new float[5];
				maior = 0;

				for (int i = 0; i < vetor.length; i++) 
				{
					System.out.print("Digite o " + (i + 1) + " valor: ");
					vetor[i]=ler.nextFloat();
					
					if(vetor[i]>maior) 
					{
						maior=vetor[i];
					}
				}
				System.out.println("O maior valor é: " +maior);
				System.out.println("");

			}
		}

	}

}