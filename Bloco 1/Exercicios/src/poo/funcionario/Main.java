package poo.funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario ();
		int x=900;
		
		funcionario.nome= "Peter";
		funcionario.cargo= "Gerente";
		funcionario.horarioEntrada= 9.00;
		funcionario.horarioSaida=18.00;
		funcionario.funcionarioPresente(); 
				

	}

}
