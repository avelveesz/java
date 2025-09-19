package Pimeiroprojeto;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		for(int cont = 0; cont <= 30; cont++) {
			System.out.println(cont);
			}
		//2 - Classificação de Idades
		for(int idade = 1; idade <= 10; idade++) {
			System.out.println("informe 10 idades?");
			double salario = scanner.nextDouble();
				if(salario <18 ) {
				System.out.println("menor de idade");
				}else {
					System.out.println("maior de idade");
	}
		}
//3 - Eleição
			     System.out.println("Códigos de votação:");
			        System.out.println("1 - Candidato 1");
		        System.out.println("2 - Candidato 2");
			       System.out.println("3 - Candidato 3");
			       System.out.println("4 - Candidato 4");
		       System.out.println("5 - Voto Nulo");
		        System.out.println("6 - Voto em Branco\n");
		        for (int i = 1; i <= 5; i++) {
		        System.out.print("Eleitor " + i + " - Informe seu voto: ");
			            int voto = scanner.nextInt();
	            if (voto == 1) {
	       System.out.println("Você votou no Candidato 1.");
		            } else if (voto == 2) {
		             System.out.println("Você votou no Candidato 2.");
		            } else if (voto == 3) {
		           System.out.println("Você votou no Candidato 3.");
		            } else if (voto == 4) {
	             System.out.println("Você votou no Candidato 4.");
	         } else if (voto == 5) {
	              System.out.println("Você votou Nulo.");
	            } else if (voto == 6) {
	            System.out.println("Você votou em Branco.");
	        } else {
	                System.out.println("Voto inválido!");
		            }
		        }

	            
//4 - Repetição de Frase
	         System.out.println("quantas vezes quer ver a mensagem?");
	       int escolha = scanner.nextInt();
	   		for (int texto = 1; texto <= escolha; texto++) {
	   		System.out.println("bom dia");
	     } 		
	   //		5 - Sequência
	  		for(int cont = 50; cont >= 30; cont--) {
	   		System.out.println(cont);
	    }
	           
	  		
	        // 6 - Números Alternados
	        System.out.println("6 - Números Alternados (1 a 50):");
	        for (int i = 1; i <= 50; i += 2) {
	            System.out.println(i);
	        }
	        System.out.println("------------------------------");
	        
	        // 7 - Aprovado ou Reprovado
	        System.out.println("7 - Aprovado ou Reprovado:");
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite a " + i + "ª nota: ");
	            double nota = scanner.nextDouble();
	            
	            if (nota >= 6.0) {
	                System.out.println("Aprovado");
	            } else {
	                System.out.println("Reprovado");
	            }
	        }
	        System.out.println("------------------------------");
	        
	        // 8 - Categoria de Idade
	        System.out.println("8 - Categoria de Idade:");
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite a " + i + "ª idade: ");
	            int idade = scanner.nextInt();
	            
	            if (idade <= 12) {
	                System.out.println("Criança");
	            } else if (idade <= 17) {
	                System.out.println("Adolescente");
	            } else if (idade <= 59) {
	                System.out.println("Adulto");
	            } else {
	                System.out.println("Idoso");
	            }
	        }
	        System.out.println("------------------------------");
	        
	        // 9 - Número Positivo ou Negativo
	        System.out.println("9 - Número Positivo ou Negativo:");
	        for (int i = 1; i <= 7; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            double numero = scanner.nextDouble();
	            
	            if (numero > 0) {
	                System.out.println("Positivo");
	            } else if (numero < 0) {
	                System.out.println("Negativo");
	            } else {
	                System.out.println("Zero");
	            }
	        }
	        
			
			
			
			
			
			
			
			
			
			
		}

	
	            		
	            		
	            		
	            		
				}



