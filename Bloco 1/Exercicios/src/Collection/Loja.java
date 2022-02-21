package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Loja {

	public static void main(String[] args) {
		
		Collection<String> roupas = new ArrayList<>();
		

        roupas.add("Blusa");
        roupas.add("Short");
        roupas.add("Calça");
        roupas.add("Camiseta");
        roupas.add("Jaqueta");
        
		System.out.println("Lista de roupas: "+roupas);
		roupas.remove("Camiseta");
		
		System.out.println("\nLISTA ATUALIZADA !!!");
		
		for(String name : roupas) 
		{
			System.out.println("\nLista de roupas: "+name);
		}

	}

}
