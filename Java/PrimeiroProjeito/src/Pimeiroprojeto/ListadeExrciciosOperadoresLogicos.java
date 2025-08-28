package Pimeiroprojeto;

import java.util.Scanner;

public class ListadeExrciciosOperadoresLogicos {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		//Scanner scanner = new Scanner (System.in);
		System.out.println("Qual sua idade?");
		int idade2 = scanner.nextInt();
		System.out.println("Possui experiencia?");
		String resposta2 = scanner.next();
		//e
		if ((idade2 > 16 &&  idade2 < 70) && resposta2.equalsIgnoreCase("sim")) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		
		
		
		//2 - Promoção de Produto
		System.out.println("Qual valor da compra?");
		double valor = scanner.nextDouble ();
		System.out.println("qual a quantidade comprada?");
		double quantidade = scanner.nextDouble ();
		
		  if (valor > 200 && quantidade > 5) {
	            valor *= 0.85; // aplica 15% desconto
	            System.out.println("Desconto aplicado. Valor final: R$ " + valor);
	        } else {
	            System.out.println("Valor final: R$ " + valor);
	        }
		  
		  
		  //3 - Alerta de Saúde
		  double bpm;
		  System.out.println("informe sua frequencia: ");
		  bpm = scanner.nextInt();
		  System.out.println("sente tontura?");
		  String tontura = scanner.next();
		  //ou
		  if (bpm >= 100 || tontura.equalsIgnoreCase("sim"))
	            System.out.println("Procure atendimento médico");
	        else
	            System.out.println("Sem sinais de alerta");
		  
		  
		  //4 - Participação em Concurso
		  System.out.println("Qual sua idade");
			int idade = scanner.nextInt();
			System.out.println("é residente do estado?");
			String resposta = scanner.next();
			//e
			if ((idade > 18 &&  idade < 30) && resposta.equalsIgnoreCase("sim")) {
				System.out.println("Elegível para o concurso");
			} else {
				System.out.println("Não elegível para o concurso");
	}
			//5 - Recompensa por Desempenho
			System.out.println("projetos concluídos:");
			int projeto = scanner.nextInt();
			System.out.println("número de erros reportados:");
			int reportacao = scanner.nextInt();
			//e
			if (projeto > 10 &&  reportacao < 3) {
				System.out.println("Inscrição aceita");
			} else {
				System.out.println("inscrição rejeitada ");
			}
			//6 - Autorização para Viagem
			System.out.println("Qual sua idade:");
			int idade3 = scanner.nextInt();
			System.out.println("possui passaporte válido?");
			String passaporte = scanner.next();
			//e
			if (idade <= 18 && resposta.equalsIgnoreCase("SIM")) {
				System.out.println("Viagem autorizada");
			} else {
				System.out.println("Viagem não autorizada");
			}
			//7 - Aprovação em Curso Online
			   System.out.print("Nota final (0 a 100): ");
		        int nota = scanner.nextInt();
		        System.out.print("Aulas assistidas (0 a 50): ");
		        int aulas = scanner.nextInt();

		        if (nota >= 70 && aulas >= 40) {
		            System.out.println("Aprovado");
		        } else {
		            System.out.println("Reprovado");
		    }
	// 8 - Controle de Irrigação
        System.out.print("Umidade do solo (%):");
        int umidade = scanner.nextInt();
        System.out.print("Temperatura (°C): ");
        int temperatura = scanner.nextInt();

        if (umidade < 30 || temperatura > 30) {
            System.out.println("Irrigação necessária");
        }else {
            System.out.println("Irrigação não necessária");
        }
            
        // 9 - 
        System.out.print("Digite sua idade: ");
        int idadeFeira = scanner.nextInt();
        System.out.print("Possui experiência prévia? (sim/nao): ");
        String experiencia = scanner.next();

        if (idadeFeira >= 20 && idadeFeira <= 40 && experiencia.equalsIgnoreCase("sim")) {
            System.out.println("Inscrição aceita");
        } else {
            System.out.println("Inscrição não permitida");
        }
            
            
            
            
    }
}

