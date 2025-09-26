package Pimeiroprojeto;

import java.util.Scanner;

public class operadoresLogicos2 {

	public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);
System.out.println("Qual sua idade");
int idade = scanner.nextInt();
System.out.println("Tem titulo de eleitor?");
String resposta = scanner.next();
//e
if (idade >= 16 && resposta.equalsIgnoreCase("SIM")) {
	System.out.println(" Pode votar");
} else {
	System.out.println("Não pode votar");
}

int numero;
System.out.println("informe um numero: ");
numero = scanner.nextInt();
//ou
if(numero >=10 || numero <=20) {
	System.out.println("O numero esta entre 10 e 20");
} else {
	System.out.println("O numero esta fora ");
}
System.out.println("Qual valor da compra?");
	double valor = scanner.nextDouble ();
	System.out.println("È cliente vip?");
	boolean vip = scanner.nextBoolean();
	
	if(valor > 200 && vip == true) { // false
		double desconto = valor * 0.15;
		double valorfinal = valor - desconto;
		System.out.printf("Vai pagr: %.2f , valorFinal");
	} else {
		System.out.println("Não tem desconto");
		
		
		
	// para participar de um workshop precisa ter idade entre 20 e 40 anos e possuir experiencia. Se as informações forem verdadeiras exiba "inscrição aceita", seão "incroção rejeitada"*/
		System.out.println("Qual sua idade");
		int idade2 = scanner.nextInt();
		System.out.println("Possui experiencia?");
		String resposta2 = scanner.next();
		//e
		if ((idade2 > 20 &&  idade2 < 40) && resposta2.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição aceita");
		} else {
			System.out.println("inscrição rejeitada ");
			
			
			}
		}
	}
	}

	
	

