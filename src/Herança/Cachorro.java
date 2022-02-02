package Herança;

public class Cachorro extends Animal {
	
	public void correr() {
		System.out.println("CORRENDO");
	
	}
	@Override
	public void emitirSom() {
		System.out.println("AU AU");
	}

}
