package poo.aviao;

public class Main {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		aviao.cor = "vermelho";
		aviao.marca = "Viena";
		aviao.porte = "pequeno";
		aviao.quantidadeDeAcentos = 35;
		
		System.out.println(aviao);
		
		System.out.println("Quantidade de acentos: " + aviao.quantidadeDeAcentos);
		String mensagem = aviao.reservarAcentos(40);
		System.out.println("Mensagem depois de reserver os acentos: " + mensagem);
		System.out.println("Quantidade de acentos atual " + aviao.quantidadeDeAcentos);
	}
	
}
