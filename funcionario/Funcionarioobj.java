package br.com.generation.listaPOO;
import java.util.Scanner;
public class Funcionarioobj {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario();
		
		boolean primeiro = true;
		
		System.out.println("Digite seu nome: ");
		func1.setNome(scan.next()); 
		
		System.out.println("Digite seu cargo: ");
		func1.setCargo(scan.next()); 
		
		System.out.println("Digite seu tempo de contribuicao: ");
		func1.setContribuicao(scan.nextInt()); 
		
		func1.emprego(primeiro);
		
		if (primeiro == true) {
			
			func1.ferias(func1.getContribuicao());
			func1.situacao();
		}
	
	scan.close();
	}

}
