package poo.patineteDOU;

public class Patinete {

	String cor;
	int tamanho = 0 ;
	String marca;
	
	public Patinete (String cor,String marca, int tamanho)
	{
		this.cor=cor;
		this.marca=marca;
		this.tamanho=0;
		
	}
	
	public void status () {
		System.out.println("Marca: ");
		System.out.println("Tamanho:");
		System.out.println("Cor:");
	}
		
	
}
