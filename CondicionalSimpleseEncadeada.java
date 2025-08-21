package Pimeiroprojeto;

import java.util.Scanner;

public class CondicionalSimpleseEncadeada {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
int idade;
System.out.println("Informe sua idade");
idade = scanner.nextInt();
if (idade <= 12) {
  System.out.println("Criança");
} else if (idade <= 17) {
  System.out.println("Adolescente");
} else if (idade<= 59) {
  System.out.println("Adulto");
} else if (idade<= 60) {
	 System.out.println("Idoso");
}
	 //2 - Avaliação de Temperatura
	 double temperatura ;
	 System.out.println("Informe a temperatura");
	 temperatura = scanner.nextDouble();
	 if (temperatura <= 10) {
	   System.out.println("Muito Frio");
	 } else if (temperatura <= 20) {
	   System.out.println("Frio");
	 } else if (temperatura<= 30) {
	   System.out.println("Agradáve");
	 } else if (temperatura>= 30) {
	 	 System.out.println("Muito Quente");
	 }
	 	 //3 - Sistema de Notas Escolares
	 System.out.print("Digite a nota: ");
     int nota = scanner.nextInt();

     if (nota > 90) {
         System.out.println("A");
     } else if (nota > 80) {
         System.out.println("B");
     } else if (nota > 70) {
         System.out.println("C");
     } else if (nota > 60) {
         System.out.println("D");
     } else {
         System.out.println("F");
     }
         //4 - Verificação de senha
     System.out.print("Digite a senha: ");
     String senha = scanner.next();

     if (senha.equals("admin")) {
         System.out.println("Acesso permitido!");
     } else {
         System.out.println("Acesso negado!");
     }
     
     //5 - Comparação de nomes
     System.out.print("Digite o primeiro nome: ");
     String nome1 = scanner.nextLine();

     System.out.print("Digite o segundo nome: ");
     String nome2 = scanner.nextLine();

     if (nome1.equalsIgnoreCase(nome2)) {
         System.out.println("Os nomes são iguais.");
     } else {
         System.out.println("Os nomes são diferentes.");
     }


	 	 //6 - Jogo da cor favorita
  // 6 - Jogo da cor favorita
     System.out.println("Informe sua cor favorita: ");
		String cor = scanner.next();
		if (cor.equalsIgnoreCase("Azul")) {
			System.out.println("Boa escolha!");
		}else if (cor.equalsIgnoreCase("Vermelho")) {
			System.out.println("Cor vibrante!");
		}else if (cor.equalsIgnoreCase("verde")) {
			System.out.println("Cor da natureza!");
		}else {
			System.out.println("Cor não cadastrada");
		}
		
	  // 7 - Verificação de vogal
		System.out.println("Digite a letra: ");
		String letra = scanner.next();
		if (letra.equalsIgnoreCase("a")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("e")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("i")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("o")) {
			System.out.println("É uma vogal.");
		}else if (letra.equalsIgnoreCase("u")) {
			System.out.println("É uma vogal.");
		}else {
			System.out.println("Não é uma vogal.");
		}
    
     
}
	}
	
