package lista22;

import java.util.Scanner;

public class GatoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    Gato gato1 = new Gato();
        gato1.nome = "shake";
        gato1.idade = 3;
        gato1.raca = "Siamês";
        gato1.miar();

        System.out.println();
        
        Gato gato2 = new Gato();
        System.out.println("Qual o nome do seu gato?");
        gato2.nome = sc.next();

        System.out.println("Qual é a idade?");
        gato2.idade = sc.nextInt();

        System.out.println("Qual é a raça?");
        gato2.raca = sc.next();

        gato2.miar();

	}

}
