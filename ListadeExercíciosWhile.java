package Pimeiroprojeto;

import java.util.Scanner;

public class ListadeExercíciosWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++;// +1
	}
		//2 - Contagem regressiva
		int numero2 = 10;
		while (numero2 >= 1) {
			System.out.println(numero2);
			numero2--; //-1
}
		//3 - Sequência numérica
		int numero3 = 0;
		while (numero3 <= 100) {
			System.out.println(numero3);
			numero3+=5; 
}
		//4 - Mostrando mensagem

	        int msg = 1;
	        while (msg <= 5) {
	            System.out.println("Eu gosto de Java");
	            msg++;
	        }

	   
	        //  Soma de 5 números digitados
	        int contador = 1;
	        int soma = 0;
	        while (contador <= 5) {
	            System.out.print("Digite o " + contador + "º número: ");
	            int numero5 = scanner.nextInt();
	            soma += numero5;
	            contador++;
	        }
	        System.out.println("A soma total é: " + soma);

	      

	        //  Validação de Senha 
	        int senha = 0;
	        while (senha != 1234) {
	            System.out.print("Digite a senha: ");
	            senha = scanner.nextInt();
	            if (senha != 1234) {
	                System.out.println("Senha incorreta, tente novamente!");
	            }
	        }
	        System.out.println("Senha correta, acesso liberado!");


	        // Contagem regressiva 
	        System.out.print("Digite um número positivo: ");
	        int num = scanner.nextInt();

	        while (num > 0) {
	            System.out.println(num);
	            num--;
	        }
	     
	    }

}
