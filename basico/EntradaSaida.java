package cursoJava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		//Cria��o de vari�veis
		String nome;
		int idade;
		double altura;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome.");
		
		nome = leitor.nextLine();
		
		System.out.println("Digite sua idade.");
		
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura.");
		
		altura = leitor.nextDouble();
		
		
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("altura: "+altura);
		

				

	}

}
