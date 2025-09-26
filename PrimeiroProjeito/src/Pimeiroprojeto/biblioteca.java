package Pimeiroprojeto;

import java.util.Scanner;

public class biblioteca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.println("Qual é seu nome?");
		nome = scanner.nextLine();
		System.out.println("Olá " + nome);
		//-----------------------------------
		double salario, aumento;
		System.out.print("Informe o salario: ");
		salario = scanner.nextDouble();
		System.out.println("Informe o aumento: ");
		aumento = scanner.nextDouble();
		double total = salario + aumento;
		System.out.println("O novo salario é: " + total);
		//-----------------------------------------------
		int numero;
		System.out.println("informe o numero: ");
		numero = scanner.nextInt();
		int divisao = numero / 2;
		int resto = numero % 2;
		System.out.println("numero / 2: " + divisao);
		System.out.println("numero % 2: "+ resto);
		//print -  Mostrar o texto sem pular linha 
		System.out.println("olá");
		System.out.println("mundo \n");
		//println- Pular uma liha depois de ,mostrar o texto 
		System.out.println("olá");
		System.out.println("mundo");
		// printf - formatado 
		int idade = 20;	
		double salario1 = 2000.50;
		System.out.println("A idade é: " + idade);
		System.out.printf(" a idade é: %d" , idade);
		System.out.printf("A idade é %d e o salario é %f , idade, salario");
		System.out.println("A idade é" + idade + "e o salario é" + salario1);
		// %s = String            %f = float e double
		// %d = int               %c = chart
		double valor = 8.7;
		System.out.printf(" valor %.5f" ,valor);
		
		System.out.println("\n\n");
	//	Comparaçao de texto 
		String senha = "1234";
		if (senha.equals("1234")) { // senha == "1234"
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso negado");
		}
		String palavra = "java";
		String palavra2 = "java";
		if(palavra.equals(palavra2)) {
			System.out.println("foi");
		} else {
			System.out.println("não foi");
		}
				System.out.println("informe uma palavra");
		String resposta = scanner.next();
		
		if(resposta.equals("java")) {
			System.out.println("Acertou");
		}
		System.out.print("Inform uma cor: " );
		String cor = scanner.next();
		if(cor.equalsIgnoreCase("azul")) {
			System.out.println("Cor azul");
		} else if (cor.equalsIgnoreCase("verde")) {
		} else {
			System.out.println("cor errada");
		}
		
		}
		
		
	}
	

