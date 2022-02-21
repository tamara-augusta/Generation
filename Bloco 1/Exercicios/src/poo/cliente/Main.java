package poo.cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.escolaridade = "Ensino superior";
		cliente.idade = 35;
		cliente.nome = "Maria Aparecida";
		cliente.trabalhando = true;	
		
		System.out.println(cliente);
		
	}
	
}
