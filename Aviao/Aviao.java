package br.com.generation.listaPOO;

public class Aviao {
	
	String modelo,cor,marca; 
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	void voar() {
		System.out.println("O avi�o est� voando.");
	}
	void pousar() {
		System.out.println("O avi�o est� pousando.");
	}
	void defeito() {
		System.out.println("O avi�o est� com defeito.");
	}

}
