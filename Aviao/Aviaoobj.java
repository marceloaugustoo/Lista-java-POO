package br.com.generation.listaPOO;

public class Aviaoobj {
	
	public static void main(String[]args) {
		
		Aviao av1 = new Aviao();
		
		av1.setCor("Branco");
		av1.setMarca("TAM");
		av1.setModelo("A319");
		
		System.out.println(av1.getCor());
		System.out.println(av1.getMarca());
		System.out.println(av1.getModelo());
		
		av1.voar();
		av1.pousar();
		av1.defeito();
	}

}
