package Herança;

public class Cavalo extends Animal {
	
	public void correr() {
		System.out.println("CORRENDO");
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println ("relinchou");
	}
	

}
