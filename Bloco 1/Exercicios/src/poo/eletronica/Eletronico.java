package poo.eletronica;

public class Eletronico {

	//atributos
	String marca;
	String cor;
	int modelo;
	int ano;

	//metodo contrutor
	public Eletronico () {
		
	}
	
	public Eletronico (String marca,int modelo,String cor, int ano) {
		
		this.marca=marca;
		this.modelo=modelo;
		this.cor=cor;
		this.ano=ano;
		
				
	}
	public void Status() {
		
		System.out.println("Marca:" +marca);
		System.out.println("Modelo: " +modelo);
		System.out.println("Cor: " +cor);
		System.out.println("Ano: " +ano);
			
		
	}
	@Override
	public String toString() {
		return "eletronico [marca=" + marca + ", cor=" + cor + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
	
}
