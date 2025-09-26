package Pimeiroprojeto;

import java.util.Scanner;

public class whilelista {

	public static void main(String[] args) {
		int contador = 1;
		while(contador <= 30) {
			System.out.println(contador);
			contador++;//+1
		}
		//Soma de Números Digitados
		Scanner sc = new Scanner(System.in);
		int contador2 = 1;
		int soma = 0;
		while(contador2 <= 3) {
			System.out.println("digite o numero "+  contador2 + ":");
			int numero = sc.nextInt();
			soma = soma + numero;
			contador2++;
		}
		System.out.println("A soma é:" + soma);
		System.out.println("--------------------");
		// Multiplicação de Números Digitados
		Scanner scanner = new Scanner(System.in);
		int contador3 = 1;
		int mult = 1;
		while(contador3 <= 5) {
			System.out.println("digite o numero "+  contador3 + ":");
			int numero = sc.nextInt();
			mult = mult * numero;
			contador3++;
		}
		System.out.println("A multiplicação é:" + mult);
		System.out.println("--------------------");
		//4 - Contar até o número informado
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i <= numero) {
            System.out.print(i + " ");
            i++;
        }
        //5 - Somar os números de 1 a 5:
                int in = 1;
                int soma2 = 0;

                while (in <= 5) {
                    soma2 += in;
                    in++;
                }

                System.out.println("A soma dos números de 1 a 5 é: " + soma2);
            
            //6 - Tabuada
	
			System.out.println("Digite um número para ver a tabuada: ");
			int tabuada = scanner.nextInt();
			int t = 1;
			while (i <= 10) {
				System.out.println(tabuada + " x " + t + " = " + (tabuada * t));
				t++;
			
			}
                    }

}

