package poo.aviao;

public class Aviao {
	
	String porte;
	String cor;
	String marca;
	int quantidadeDeAcentos;
	
	//m�todo.
	public String reservarAcentos (int quantidade) {
		if (quantidade>quantidadeDeAcentos) {
			return "N�O TEM A QUANTIDADE SOLICITADA DE ACENTOS";
		}
		
		quantidadeDeAcentos=quantidadeDeAcentos-quantidade;
		return "ACENTOS RESERVADOS COM SUCESSO";
	}

	@Override
	public String toString() {
		return "Aviao [porte=" + porte + ", cor=" + cor + ", marca=" + marca + ", quantidadeDeAcentos="
				+ quantidadeDeAcentos + "]";
	}
	
	
} 
