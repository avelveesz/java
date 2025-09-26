package Pimeiroprojeto;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		for(int cont = 0; cont <= 10; cont++) {
			System.out.println(cont);

			}
System.out.println("---------------------");
			//Mostrando uma mensagem
System.out.println("quantas vezes quer ver a mensagem?");
int escolha = scanner.nextInt();
		for (int texto = 1; texto <= 3; texto++) {
			System.out.println("Hoje é quinta");
		}
		System.out.println("-----------------");
		/*Peça cinco salários para o usuário, se o salário for menor ou igual a 1500, mostre "você terá um aumento", senao, mostre "sem aumento"*/
		for(int voltas = 1; voltas <= 5; voltas++) {
		System.out.println("Qual seu salário?");
		double salario = scanner.nextDouble();
			if(salario <=1500 ) {
			System.out.println("Você terá um aumento");
			}else {
				System.out.println("sem aumento");
		}
			}
		/*o usuario ira informar um valor 5 vezes, some is valores digitadios por ele e mostre o resultado no final*/
		int soma = 0;
		for(int vez = 1; vez <= 5; vez++) {
			System.out.println("informe um valor ");
			int valor = scanner.nextInt();
			soma = soma + valor; //soma += valor
		}
		System.out.println("o resultado da soma é: " + soma);
		}
	}


