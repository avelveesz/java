package lista22;

import java.util.Scanner;

public class ClasseMusicaP {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Criar três músicas
	        Musica[] musicas = new Musica[3];

	        for (int i = 0; i < 3; i++) {
	            musicas[i] = new Musica();

	            System.out.println("Digite o título da música " + (i + 1) + ":");
	            musicas[i].titulo = sc.nextLine();

	            System.out.println("Digite o artista da música " + (i + 1) + ":");
	            musicas[i].artista = sc.nextLine();

	            System.out.println("Digite a duração da música " + (i + 1) + " em minutos:");
	            musicas[i].duracao = sc.nextDouble();
	            sc.nextLine(); // limpar o buffer do enter

	            System.out.println(); // separador
	        }

	        // Tocar e mostrar informações de cada música
	        for (Musica m : musicas) {
	            m.tocar();
	            m.mostrarDetalhes();
	            m.pausar();
	            System.out.println(); // separador
	        }

		    }
	

	}

