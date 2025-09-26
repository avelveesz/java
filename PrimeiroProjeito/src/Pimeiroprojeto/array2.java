package Pimeiroprojeto;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Scanner scanner = new Scanner(System.in);
		int[] idade = new int [5];
		idade[0] = 20;
		idade[1] = 22;
		idade[2] = 16;
		idade[3] = 30;
		idade[4] = 40;
		double[] salario = new double [3];
		for(int i=0; i<salario.length; i++) {
			System.out.println("salario "+i+":");
				salario[i] = sc.nextDouble();
			}
			System.out.println("mostrando o vetor");
			for(int i=0; i<3; i++) {
				System.out.println("salario "+i+":"+salario[i]);
			}
			String [] avaliacao = new String [5];
			for (int i = 0; i<5 ; i++) {
				System.out.println("Informe sua avaliação: ");
				avaliacao [i] = sc.next();
				if (avaliacao [i].equalsIgnoreCase("Bom")) {
					System.out.println("Obrigado");
				}else {
					System.out.println("Tchau");
				}
			}
			/*Crie um vetor inteiro de três posições e mostre ele ao contrário*/
			
			int[] num = new int[3];
			for(int i= 0; i < 3; i++) {
				System.out.print("Digite os números ["+i+"]: ");
				num[i] = sc.nextInt();
			}
				for(int i= 2; i >= 0; i--) { 
					System.out.println("Valores [" +i+ "]:"+ num [i]);
				}
	}
}

	


