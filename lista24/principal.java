package lista24;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	
		cachorro c1 = new cachorro();
		Scanner sc = new Scanner(System.in);
		gato gato = new gato();
		
		
		System.out.println("Qual o nome do Pet? ");
		String nome = sc.next();
		
		System.out.println("Qual a idade do Pet? ");
		int idade = sc.nextInt();
		
		System.out.println("Qual a raça do cachorro? ");
		String raca = sc.next();
		
		System.out.println("Qual a cor do gato? ");
		String cor = sc.next();
		
		
		
		c1.setNome(nome);
		c1.setIdade(idade);
		c1.setRaca(raca);
		gato.setCor(cor);
		
		System.out.println("O nome é: " + c1.getNome());
		System.out.println("A idade é: " + c1.getIdade());
		System.out.println("A raça é: " + c1.getRaca());
		System.out.println("A cor é: " + gato.getCor() );
		
		c1.abanarRabo();
		gato.subirNoMuro();
		
		
		
		

	}

}
