package Herança;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setNome("poll");
		animal.emitirSom();
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("pilurito");
		cavalo.emitirSom();
		cavalo.correr();
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("princesa");
		cachorro.emitirSom();
		cachorro.correr();
		
		
		Preguica preguica = new Preguica();
		preguica.setNome("fatima");
		preguica.emitirSom();
		preguica.subiEmArvore();
		
		executarAcao(cachorro);
	}
	
	private static void executarAcao(Animal animal) {
		
		animal.emitirSom();
		
	}

}
