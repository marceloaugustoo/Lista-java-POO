package br.com.generation.listaPOO;

public class clienteobj {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente();
		cliente cliente2 = new cliente();
		
		cliente1.setNome("Marcelo");
		cliente1.setIdade(20);
		cliente1.setNc(1234);
		
		cliente2.setNome("Junior");
		cliente2.setIdade(20);
		cliente2.setNc(1234);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getNc());
		
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getIdade());
		System.out.println(cliente2.getNc());
		
		cliente1.comprar();
		cliente1.cadastro();
		
		cliente2.comprar();
		cliente2.cadastro();
		
		

	}

}
