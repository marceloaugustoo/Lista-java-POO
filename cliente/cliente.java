package br.com.generation.listaPOO;

public class cliente {
	
	private String nome;
	private int idade,nc ;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
	void comprar() {
		System.out.println("O cliente " + nome + " está comprando.");
	}
	void cadastro() {
		System.out.println("O cliente " + nome + " está cadastrado.");
	}
	

}
