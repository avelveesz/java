package Pimeiroprojeto;

import java.util.Scanner;

public class lista2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double primeironumero;
		double segundonumero;
		System.out.println("informe o primero numero");
		primeironumero = scanner.nextDouble();
		System.out.println("informe o segundo numero");
		segundonumero = scanner.nextDouble();
double soma = primeironumero + segundonumero;
double sub = primeironumero - segundonumero;
double div = primeironumero / segundonumero;
double mult = primeironumero * segundonumero;

System.out.println("soma: " + soma);
System.out.println("subtracao:  "+ sub);
System.out.println("multiplicação: "+ mult);
System.out.println("divisao: "+ div);

//2 - Cálculo de temperatura
System.out.print("Digite a temperatura em Celsius: ");
double celsius = scanner.nextDouble();
double fahrenheit = (celsius * 1.8) + 32;
System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

//3 - Conversão de valor
System.out.println("informe o valor em rais: ");
double valor = scanner.nextDouble();
double dolar = 5.70;
double conversão = valor / dolar;
System.out.println("Valor em dólares: " + conversão);
//4 - Área do retângulo
System.out.println("Informe a base do triangulo");
double base = scanner.nextDouble();
System.out.println("Informe a altura do triangulo");
double altura = scanner.nextDouble();
double area = base * altura;
System.out.println("Área do retângulo: " + area);

//5 - Conversor de idade
System.out.print("Digite sua idade em anos: ");
int idadeAnos = scanner.nextInt();
int mesesVividos = idadeAnos * 12;
System.out.println("Você já viveu aproximadamente " + mesesVividos + " meses.");

//6 - Conversor de minutos para segundos
System.out.print("Digite o tempo em minutos: ");
int minutos = scanner.nextInt();
int segundos = minutos * 60;
System.out.println("Tempo em segundos: " + segundos);

// 7 - Custo da compra
System.out.print("Digite o preço do produto: ");
double preco = scanner.nextDouble();
System.out.print("Digite a quantidade comprada: ");
int quantidade = scanner.nextInt();
double custoTotal = preco * quantidade;
System.out.println("Custo total: R$" + custoTotal);

// 8 - Divisão de conta de restaurante
System.out.print("Digite o valor total da conta: ");
double conta = scanner.nextDouble();
System.out.print("Digite o número de pessoas: ");
int pessoas = scanner.nextInt();
double valorPorPessoa = conta / pessoas;
System.out.println("Cada pessoa deve pagar R$" + valorPorPessoa);

// 9 - Cálculo de troco
System.out.print("Digite o valor da compra: ");
double valorCompra = scanner.nextDouble();
System.out.print("Digite o valor pago pelo cliente: ");
double valorPago = scanner.nextDouble();
double troco = valorPago - valorCompra;
System.out.println("Troco: R$" + troco);
	}
}
