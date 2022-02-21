package Herança;

public class Animal {
	
	private String nome;
	private int idade;
	
	/*
	public Animal (String nome, String subiEmArvore, String emiteSom, int idade) {
		
		this.nome = nome;
		this.emiteSom = emiteSom;
		this.subiEmArvore = subiEmArvore;
		this.idade = idade;
		
	}
*/
	public void emitirSom() {
		System.out.println(nome + " emitiu o som");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

		

}
