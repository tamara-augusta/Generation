package poo.funcionario;

public class Funcionario {
	//atributo
	
	String nome;
	String cargo;
	double horarioEntrada = 0;
	double horarioSaida = 0;
	boolean presente;
	
	//Método
	
	
	public void presente() {
		this.presente=true;
		
	 }
	public void ausente() {
		this.presente=false;
	}
	public void funcionarioPresente() {
		 if (this.presente)
			 System.out.println("Funcinario presente no trabalho");
		 else 
			 System.out.println("Falta funcionario no setor");
	}
		
	

}
