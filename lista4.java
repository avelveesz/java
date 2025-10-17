package Pimeiroprojeto;

import java.util.Scanner;

public class lista4 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        // ===========================
	        // 1 - Verificar maioridade
	        // ===========================
	        System.out.println("=== Exercício 1 – Verificar maioridade ===");
	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();
	        if (idade >= 18) {
	            System.out.println("Você tem " + idade + " anos e é maior de idade.");
	        } else {
	            System.out.println("Você tem " + idade + " anos e é menor de idade.");
	        }

	        // ===========================
	        // 2 - Comparar dois números
	        // ===========================
	        System.out.println("\n=== Exercício 2 – Comparar dois números ===");
	        System.out.print("Digite o primeiro número: ");
	        int num1 = sc.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int num2 = sc.nextInt();
	        if (num1 > num2) {
	            System.out.println("O primeiro número é maior.");
	        } else {
	            System.out.println("O segundo número é maior ou eles são iguais.");
	        }

	        // ===========================
	        // 3 - Aprovação por nota
	        // ===========================
	        System.out.println("\n=== Exercício 3 – Aprovação por nota ===");
	        System.out.print("Digite a nota do aluno: ");
	        double nota = sc.nextDouble();
	        if (nota > 7) {
	            System.out.println("Aprovado: sua nota foi " + nota);
	        } else {
	            System.out.println("Reprovado: sua nota foi " + nota);
	        }

	        // ===========================
	        // 4 - Verificar número positivo
	        // ===========================
	        System.out.println("\n=== Exercício 4 – Verificar número positivo ===");
	        System.out.print("Digite um número: ");
	        double numero = sc.nextDouble();
	        if (numero > 0) {
	            System.out.println("O número é positivo.");
	        } else {
	            System.out.println("O número é negativo ou zero.");
	        }

	        // ===========================
	        // 5 - Cálculo de frete
	        // ===========================
	        System.out.println("\n=== Exercício 5 – Cálculo de frete ===");
	        System.out.print("Digite a distância de entrega (km): ");
	        double distancia = sc.nextDouble();
	        double frete;
	        if (distancia <= 50) {
	            frete = 10.00;
	        } else {
	            frete = distancia * 0.5;
	        }
	        System.out.println("Valor do frete: R$ " + frete);

	        // ===========================
	        // 6 - O Número é 10?
	        // ===========================
	        System.out.println("\n=== Exercício 6 – O número é 10? ===");
	        System.out.print("Digite um número: ");
	        int valor = sc.nextInt();
	        if (valor == 10) {
	            System.out.println("O número é 10.");
	        } else {
	            System.out.println("O número não é 10.");
	        }

	        // ===========================
	        // 7 - Desconto para Associados
	        // ===========================
	        System.out.println("\n=== Exercício 7 – Desconto para Associados ===");
	        System.out.print("Você é associado da loja? (sim/não): ");
	        sc.nextLine(); // limpar o buffer
	        String resposta = sc.nextLine();
	        if (resposta.equalsIgnoreCase("sim")) {
	            System.out.println("Você tem desconto.");
	        } else {
	            System.out.println("Você não tem desconto.");
	        }

	        // ===========================
	        // 8 - Cálculo de bônus por horas extras
	        // ===========================
	        System.out.println("\n=== Exercício 8 – Cálculo de bônus por horas extras ===");
	        System.out.print("Digite o número de horas extras trabalhadas: ");
	        int horas = sc.nextInt();
	        double bonus;
	        if (horas < 10) {
	            bonus = horas * 20.00;
	        } else {
	            bonus = horas * 15.00;
	        }
	        System.out.println("Bônus por hora extra: R$" + bonus);

	        System.out.println("\n=== Fim da Lista de Exercícios ===");
	    }
	}

	
