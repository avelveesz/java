package Pimeiroprojeto;

import java.util.Scanner;

public class Lista08SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//1 - Classificação de Dia da Semana
		int escolha;
		System.out.println("Digite um número de 01 á 07 ");
		escolha = scanner.nextInt();

		switch(escolha) {
		case 1:
		System.out.println("domingo");
		break;
		case 2:
		System.out.println("segunda");
		break;
		case 3:
		System.out.println("terça");
		break;
		case 4:
		System.out.println("quarta");
		break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;
		default:
			System.out.println("Dia inválido");
		}
//2 - Menu de Bebidas
			int codigo;
			System.out.println("Digite um código de bebida  ");
			codigo = scanner.nextInt();

			switch(codigo) {
			case 1:
				System.out.println("café");
				break;
				case 2:
				System.out.println("chá");
				break;
				case 3:
				System.out.println("suco");
				break;
				case 4:
				System.out.println("Refrigerante");
				break;
			}
				switch(escolha) {
			case 1:
			System.out.println("Pague R$5.00");
			break;
			case 2:
				System.out.println("Pague R$3.50");
				break;
			case 3:
				System.out.println("Pague R$4.00");
				break;
			case 4:
				System.out.println("Pague R$4.50");
				break;
				default:
					System.out.println("Código inválido");

				      // 3 - Tipo de Veículo
		    System.out.print("Digite o código do veículo (1=Carro, 2=Moto, 3=Caminhão): ");
		        int veiculo = scanner.nextInt();
		        switch (veiculo) {
			      case 1: System.out.println("Categoria: Leve"); 
			      break;
			    case 2: System.out.println("Categoria: Motocicleta"); 
			    break;
		       case 3: System.out.println("Categoria: Pesado"); 
		       break;
	       default: System.out.println("Veículo inválido");
			 }

	   // 4 - Escolha de Plano de Assinatura
			     System.out.print("Digite o código do plano (1=Básico, 2=Intermediário, 3=Premium): ");
			  int plano = scanner.nextInt();
			 switch (plano) {
			   case 1: System.out.println("Benefícios: Acesso limitado");
break;
			   case 2: System.out.println("Benefícios: Acesso padrão + suporte"); 
			   break;
				   case 3: System.out.println("Benefícios: Acesso total + suporte prioritário");
				   break;
			        default: System.out.println("Plano inválido");
			        
			        }

		     // 5 - Seleção de Mês
		   System.out.print("Digite o número do mês (1 a 12): ");
		   int mes = scanner.nextInt();
		     switch (mes) {
			          case 12: case 1: case 2:
	            System.out.println("Estação: Verão");
	            break;
	            case 3: case 4: case 5:
		         System.out.println("Estação: Outono"); 
		         break;
		          case 6: case 7: case 8:
		           System.out.println("Estação: Inverno");
		           break;
			        case 9: case 10: case 11:
		           System.out.println("Estação: Primavera");
		           break;
			            default:
					                System.out.println("Mês inválido");
					        }

	  // 6 - Tipo de Ingresso
		   System.out.print("Digite o código do ingresso (1=Inteira, 2=Meia, 3=VIP): ");
		     int ingresso = scanner.nextInt();
		  switch (ingresso) {
				   case 1: System.out.println("Preço: R$50,00");
				   break;
	    case 2: System.out.println("Preço: R$25,00"); 
	    break;
	        case 3: System.out.println("Preço: R$100,00");
	        break;
		      default: System.out.println("Ingresso inválido");
			        }

		     // 7 - Escolha de Idioma
		      System.out.print("Digite o código do idioma (1=Português, 2=Inglês, 3=Espanhol): ");
			      int idioma = scanner.nextInt();
		       switch (idioma) {
			    case 1: System.out.println("Saudação: Olá!"); 
			    break;
		      case 2: System.out.println("Saudação: Hello!"); 
		      break;
			   case 3: System.out.println("Saudação: Hola!"); 
			   break;
	          default: System.out.println("Idioma inválido");
		        }

					        // 8 - Nível de Acesso
		        System.out.print("Digite o código do nível (1=Usuário, 2=Moderador, 3=Administrador): ");
			        int nivel = scanner.nextInt();
			        switch (nivel) {
				      case 1: System.out.println("Permissões: Acesso básico");
				      break;	            case 2: System.out.println("Permissões: Acesso básico + edição"); break;
				        case 3: System.out.println("Permissões: Acesso total");
				        break;
            default: System.out.println("Nível inválido");
			        }

		    // 9 - Tipo de Pagamento
				System.out.print("Digite o código do pagamento (1=Dinheiro, 2=Cartão, 3=Pix): ");
			   int pagamento = scanner.nextInt();
			   switch (pagamento) {
		      case 1: System.out.println("Pagamento em dinheiro confirmado"); 
		      break;
			     case 2: System.out.println("Pagamento com cartão processado");
break;
			    case 3: System.out.println("Pagamento via Pix realizado"); 
			    break;
			     default: System.out.println("Método inválido");
					        }

					    
					    }
}
}