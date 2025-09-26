package Pimeiroprojeto;
//
import java.util.Scanner;
//
public class switchCase {
//
public static void main(String[] args) {
//
//			int opcao = 2;
//
//			switch(opcao) {
//			case 1:
//			System.out.println("O número é 1");
//			break;
//			case 2:
//			System.out.println("O número é 2");
//			break;
//			default:
//			System.out.println("Numero incorreto");
//			}
//			//Cardapio da cantina
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Qual produto deseja?");
//			System.out.println("1 - Suco");
//			System.out.println("2 - Lanche");
//			System.out.println("3 - Chocolate");
//			int escolha = scanner.nextInt();
//			switch(escolha) {
//			case 1:
//			System.out.println("Pague R$4.00");
//			break;
//			case 2:
//				System.out.println("Pague R$7.00");
//				break;
//			case 3:
//				System.out.println("Pague R$5.00");
//				break;
//				default:
//					System.out.println("opção incorreta");
//	}
//			/*peça um valo para o usuario, se for igual 1 ou 2; mostre "muito bom"
//			 * se for igual 3 ou 4 mostre "bom" , senão, mostre "ruim" */
//			
//			 int valor = 2;
//			 switch(valor) {
//			 case 3:
//			 case 4:
//				 System.out.println("bom");
//				 break;
//				 default:
//					 System.out.println("ruim");
//	  	 }

Scanner scanner = new Scanner(System.in);
		int escolha;
		System.out.println("Digite um número e veja uma cor ");
		escolha = scanner.nextInt();

		switch(escolha) {
		case 1:
		System.out.println("Vermelho");
		break;
		case 2:
		System.out.println("Azul");
		break;
		default:
			System.out.println("Opção inválida");
		}
		System.out.println("Qual categoria voce pertence ");
		String categoria = scanner.next();
		switch (categoria.toUpperCase()) {
	case "A" :
		System.out.println("infantil");
		break;
		default:
			System.out.println("categoria incorreta");
		}
		
		System.out.println("Escolha a operação matematica de dois numeros");
		String operacao = scanner.next();
		switch(operacao) {
		case "+":
			int adicao = 5 + 5;
			System.out.println("adicao");
			break;
		case "-":
			int subtracao = 5 - 5;
			System.out.println("subtracao");
			break;
		case "*":
			int multiplicacao = 5 + 5;
			System.out.println("multi");
			break;
		case "/":
			int divisao = 5 / 5;
			System.out.println("divisao");
			break;
			default:
			System.out.println("operacao incorreta");
		}
}
}
