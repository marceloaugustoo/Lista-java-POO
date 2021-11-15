package br.com.generation.listaPOO;

public class ProdutoEletr {
	
	private String dispositivo;
	private int anofabri,bateria;
	
	public String getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
	public int getAnofabri() {
		return anofabri;
	}
	public void setAnofabri(int anofabri) {
		this.anofabri = anofabri;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	void manutencao() {
		if (anofabri<=2019) {
			System.out.println("O "+dispositivo+  " não está na garantia.");
		}
		else {
			System.out.println( dispositivo+" na garantia");
		}
	}
	void carregar() {
		if (bateria<=20) {
			System.out.println("Necessário carregar o "+ dispositivo +".");
		}
		else {
			System.out.println("Carga satisfatória.");
		}
	}
	
}
