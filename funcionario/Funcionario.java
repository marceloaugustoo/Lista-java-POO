package br.com.generation.listaPOO;

public class Funcionario {
	
	String nome,cargo;
	int contribuicao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getContribuicao() {
		return contribuicao;
	}

	public void setContribuicao(int contribuicao) {
		this.contribuicao = contribuicao;
	}

	void emprego(Boolean emprego) {
		
		if (emprego == true) {
			System.out.println("O funcionario " + nome + " está contratado. ");
			}
		else {
			System.out.println("O funcionario " + nome + " não possui mais vínculo. ");
		}
	}
	
	void ferias(int contribuicao) {
		
		if (contribuicao > 1) {
			System.out.println("O funcionario " + nome + " tem direito a ferias. ");
		}
		else {
			System.out.println("O funcionario " + nome + " nao  tem direito a ferias");
		}
		
	}
	
	void situacao() {
		
		System.out.println("Seu atual cargo é: "+cargo);
		
	}
	
}
