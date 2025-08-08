package Pimeiroprojeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Olá mundo" );
//declaraçao de variavel 
int idade = 24;
double salario = 2000.5;
char letra = 'j';
String nome = "juliana";
boolean chuva = false ;
System.out.println(idade);	
System.out.println("o salario é: " + salario +" reais");
System.out.println("letra: "+letra);
System.out.println("o nome é: " + nome);
	System.out.println(chuva);
	//Operadores 
	int num1 = 10;
	int num2 = 3;
	double soma = num1 + num2;
	double sub = num1 - num2;
	double div = num1 / num2;
	double mult = num1 * num2;
	double resto = num1 % num2; //modulo - resto da divisão
	
System.out.println("soma: " + soma);
System.out.println("subtracao:  "+ sub);
System.out.println("multiplicação: "+ mult);
System.out.println("divisao: "+ div);
System.out.println("resto: "+ resto);

// entrada de dados
Scanner scanner  = new Scanner  (System.in);
System.out.println("Qual seu nome? ");
String nome1 = scanner.nextLine();
System.out.println("Olá " + nome1);
// soma de dois números
int numero1;
int numero2;
System.out.println("informe o numero: ");
numero1 = scanner.nextInt();
System.out.println("informe outro numero: ");
numero2 = scanner.nextInt();
int soma1 = numero1 + numero2;
System.out.println("O resultado é: " +soma1);

/* peça o ano de nascimento do usuario e mostre quantos anos ela tem */ 
int ano = 2025;
int nascimento;
System.out.println("qual ano você nasceu? ");
nascimento = scanner.nextInt();
int total = ano - nascimento;
System.out.println("Você tem "+ total + " ano");
		// calcular desconto
double preco;
double desconto;
System.out.println("Qual o valor da compra?");
preco = scanner.nextDouble();
System.out.println("qual valor do desconto?");
desconto = scanner.nextDouble();
double pagar = preco - desconto;
System.out.println("pague: "+ pagar);
/* Peça duas notas decimais para o usuário, calcule a média e mostre*/

double primeiraNota;
double segundaNota;
System.out.println("Informe a primeira nota decimal: ");
primeiraNota = scanner.nextDouble();
System.out.println("Informe a segunda nota decimal: ");
segundaNota = scanner.nextDouble();
double media = (primeiraNota + segundaNota) / 2;
System.out.println("O resultado é: " + total);

}
}