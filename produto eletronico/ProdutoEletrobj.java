package br.com.generation.listaPOO;

public class ProdutoEletrobj {

	public static void main(String[] args) {
		
		ProdutoEletr disp1 = new ProdutoEletr();
		ProdutoEletr disp2 = new ProdutoEletr();
		
		disp1.setDispositivo("Celular");
		disp1.setAnofabri(2020);
		disp1.setBateria(15);
		
		disp2.setDispositivo("Celular");
		disp2.setAnofabri(2015);
		disp2.setBateria(80);
		
		System.out.println("Dispositivo 1: ");
		System.out.println(disp1.getDispositivo());
		System.out.println(disp1.getAnofabri());
		System.out.println(disp1.getBateria());
		
		disp1.manutencao();
		disp1.carregar();
		
		System.out.println("=================================");
		
		System.out.println("Dispositivo 2: ");
		System.out.println(disp2.getDispositivo());
		System.out.println(disp2.getAnofabri());
		System.out.println(disp2.getBateria());
		
		disp2.manutencao();
		disp2.carregar();
		
	}

}
