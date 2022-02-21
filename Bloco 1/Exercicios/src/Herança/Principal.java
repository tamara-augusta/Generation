package Herança;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		//animal.setNome("poll");
	//	animal.emitirSom();
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("pilurito");
		System.out.println(cavalo.getNome());
		cavalo.emitirSom();
		cavalo.correr();
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("princesa");
		System.out.println(cachorro.getNome());
		cachorro.emitirSom();
		cachorro.correr();
		
		
		Preguica preguica = new Preguica();
		preguica.setNome("fatima");
		System.out.println(preguica.getNome());
		preguica.emitirSom();
		preguica.subiEmArvore();
		
		executarAcao(cachorro);//metodo
	}
	
	private static void executarAcao(Animal animal) {
		
		animal.emitirSom();
		
	}

}
