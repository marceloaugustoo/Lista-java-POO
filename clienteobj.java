package br.com.generation.listaPOO;

public class clienteobj {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente();
		
		cliente1.nome = "Marcelo";
		cliente1.idade = 20;
		cliente1.nc = 123456;
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.idade);
		System.out.println(cliente1.nc);
		
		cliente1.comprar();
		cliente1.cadastro();

	}

}
