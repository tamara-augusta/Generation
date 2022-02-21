package poo.cliente;

import java.time.LocalDate;

public class Cliente {


// atributos 
	String nome;
	String escolaridade;
	int idade;
	boolean trabalhando;
	
	
	 //metodo
	public void imprimiAnoNascimento () {
		
		LocalDate hoje = LocalDate.now();
		int anoNascimento = hoje.getYear()- idade;
		System.out.println("Ano do nascimento: "+anoNascimento);
		
	}
	

	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", escolaridade=" + escolaridade + ", idade=" + idade + ", trabalhando="
				+ trabalhando + "]";
	}
		
	
}


