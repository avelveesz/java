package Pimeiroprojeto;

import java.util.Scanner;

public class lista16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1 - Criando um vetor de cores
				String[] frutas = new String[6];
				for(int i= 0; i < 6; i++) {
					System.out.println("Digite a cor:");
					System.out.print("Cores["+i+"]: ");
					frutas[i] = sc.next();
				}
					for(int i= 0; i < 6; i++) { 
						System.out.println(frutas[i]);
						
					}
					//2
					  double[] numeros = new double[8]; 
		         for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite o número decimal " + (i + 1) + ": ");
	            numeros[i] = sc.nextDouble();
		         }
				        System.out.println("\nNúmeros digitados:");
				        for (int i = 0; i < numeros.length; i++) {
				            System.out.println("Posição [" + i + "] = " + numeros[i]);
				        }

		   int[] numeros2 = new int[10]; // vetor com 10 posições

	        // 3 leitura dos valores
	        for (int i = 0; i < numeros2.length; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            numeros2[i] = sc.nextInt();
	        }

	        System.out.println("\nNúmeros pares digitados:");
	        // exibição apenas dos pares
	        for (int num : numeros2) {
	            if (num % 2 == 0) {
	                System.out.println(num);
	            }
	        }	
	    	//4 vetor com 12 posições
	        int[] numeros12 = new int[12]; 
	        for (int i = 0; i < 12; i++) {
	            System.out.print("Digite um número (" + (i + 1) + "): ");
	            numeros12[i] = sc.nextInt();
	            if (numeros12[i] < 50) {
	                System.out.println(numeros12[i] + " é menor que 50");
	            }
		}
	      //5 - Procurando um nome no vetor
			String[] nomes = new String[5];
			 for (int i = 0; i < 5; i++) {
		            System.out.print("Digite o nome " + (i + 1) + ": ");
		            nomes[i] = sc.next();
		        }
			 
			 
			 System.out.print("Digite um nome para procurar: ");
		        String procurar = sc.nextLine();
		        boolean achou = false;
		        for (int i = 0; i < 5; i++) {
		            if (nomes[i].equalsIgnoreCase(procurar)) {
		            	achou = true;
		            	System.out.println("achou");
		                break;
		            }
		        }
		        //6
		        String[] produtos = new String[4];
		        double[] precos = new double[4];
		        for(int i = 0; i < produtos.length; i++) {
		            System.out.println("Digite o nome do produto " + (i+1) + ":");
		            produtos[i] = sc.next();
		            System.out.println("Digite o preço do produto " + (i+1) + ":");
		            precos[i] = sc.nextDouble();
		        }
		        for(int i = 0; i < produtos.length; i++) {
		            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
		        }
		        
		        
		        
		        
		      //7 - Verificação de notas
		        double[] notas = new double[6];
				for(int i= 0; i < 6; i++) {
					System.out.println("Digite sua nota[" + i + "]: ");
					notas[i] = sc.nextDouble();
				}
					for(int i= 0; i < 6; i++) { 
						System.out.println("Nota " + notas[i] + " - ");
						
					
					
					 if (notas[i] < 6) {
			                System.out.println("Aluno reprovado");
			            } else if (notas[i] < 7) {
			                System.out.println("Aluno em recuperação");
			            } else {
			                System.out.println("Aluno aprovado");
			            }
			        }
					//8
			 double[] ingressos = new double[5];
		     for (int i = 0; i < ingressos.length; i++) {
		     System.out.print("Digite o preço do ingresso " + (i + 1) + ": ");
			  ingressos[i] = sc.nextDouble();
				        }
	           System.out.println("\nVerificando ingressos...");
				    for (double preco : ingressos) {
			    if (preco > 100) {
				                System.out.println("Ingresso de R$" + preco + " -> Promoção disponível!");
				            }
				        }
}
}