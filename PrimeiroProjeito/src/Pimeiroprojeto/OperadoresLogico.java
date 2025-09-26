package Pimeiroprojeto;

import java.util.Scanner;

public class OperadoresLogico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //java.util
		
		System.out.println("qual é sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Você tem ingresso? (true/false): ");
		boolean ingresso = scanner.nextBoolean();

		if(idade >= 18 && ingresso) {
		System.out.println("Entrada Permitida");
		} else {
		System.out.println("Entrada Negada");
		}
		System.out.println("--------------------");
				System.out.println("Qual sua nota? (0 a 10)");
				double nota = scanner.nextDouble();
				System.out.println("Qual sua frequência (0 a 100)");
				int frequencia = scanner.nextInt();

				if(nota >= 7 || frequencia >= 75) {
				System.out.println("Aprovado");
				} else {
				System.out.println("Reprovado");
				}
				System.out.println("---------------------------");
				/*Para logar o usuario precisa responder uma serie de perguntas, se * ele é adimistrado e se esta logado*/
System.out.println("é admin? (true/false");	
boolean admin = scanner.nextBoolean();
System.out.println("esta logado (true/ false");
	boolean logado = scanner.nextBoolean();
	if (admin && logado) {
		System.out.println("acesso permitido");
	}else {
		System.out.println("acesso negado");
	}
	System.out.println("-----------------------");
	/*peça uma letra para o usuario, se ela for A, E, I, O ou U mostre "vogal, senao, mostre consoante*/
	System.out.println("informe a letra");
	String letra = scanner.next();
	
	if(letra.equalsIgnoreCase("A") ||letra.equalsIgnoreCase("E") ||letra.equalsIgnoreCase("I") ||letra.equalsIgnoreCase("O") ||letra.equalsIgnoreCase("U")) {
		System.out.println("vogal");
	}else {
		System.out.println("consoante");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
