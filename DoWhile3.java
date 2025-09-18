package Pimeiroprojeto;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		int contador = 1;
		do {
			System.out.println(contador);
			contador++; //+1
		} while (contador <= 30);
		//2 - Adivinhação de número
		Scanner scanner = new Scanner (System.in);
		int idade;
		do {
		System.out.println("Qual o numero?");
		idade = scanner.nextInt();
		} while(idade != 5);
		System.out.println("Acertou o numero");
		//3 - Verificação de peso na mala
		int peso;
		do {
		System.out.println("informe o peso da mala:");
		 peso = scanner.nextInt();
if (peso <=23) {
		System.out.println("peso no limite"); 
	}else {
		System.out.println("ultrapassou o limite");
		}
		}while(peso> 23);
//4 - Verificar quantidade de páginas lidas na semana
int dias = 1;
int totalPaginas = 0;
do {
	System.out.println( "Quantas paginas leu hoje?");
	int passos = scanner. nextInt();
	totalPaginas = totalPaginas + passos;
	dias++; //+1
}while(dias <= 7);
System.out.println("Você leu " + totalPaginas);
//Testar código de acesso
int codigo;

do {
	System.out.println("Qual é o código?");
	codigo= scanner.nextInt();
	 if(codigo != 789){
		System.out.println("Errado! Tente novamente.");
	} else {
		System.out.println("Acertou o código!");
	} 
} while (codigo != 789);
//Verificar nível de combustivel
int nivel;

do {
	System.out.println("Qual é o nivel?");
	nivel= scanner.nextInt();
	 if(nivel<= 10){
		System.out.println("combustível baixo");
	} else {
		System.out.println("combustível está suficiente");
	} 
} while (nivel >= 10);
//7
		int distancia;
		int totalkm = 0;
		do {
			System.out.println("Digite a distância percorrida:");
			distancia = scanner.nextInt();
			if (distancia > 0) {
				totalkm += distancia;
			}
		} while (distancia > 0);
		System.out.println("Total de quilômetros percorridos: " + totalkm);

}
}



