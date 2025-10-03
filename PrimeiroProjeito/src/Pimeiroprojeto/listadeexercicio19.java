package Pimeiroprojeto;

public class listadeexercicio19 {

	public static void main(String[] args) {
	nome();
	nome();
	nome();
	frase();
	contagem();
	vogais();
	quadrado();
	pares();
	contagemRegressiva();
	triangulo();
	dias();
	

	}

	public static void nome() {
		System.out.println("Evelyn Alves");
}
	public static void frase() {
		System.out.println("Sem expectativas sem desapontamento");
}
	public static void contagem() {
		for (int i = 1; i <= 10; i++)
		System.out.println(i);
}
	public static void vogais() {
		System.out.println("A-E-I-O-U");
	}
	public static void quadrado() {
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
	}
	 public static void pares() {
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.println(i);
	        }
	        
	 }
	     
	        
	   public static void contagemRegressiva() {
	       for (int i = 10; i >= 1; i--) {
	       System.out.println(i);
	       }
	       System.out.println("Fim!");
	   }
	   
	       
	       public static void triangulo() {
	       
	       
	   	System.out.println("     *");
	   	System.out.println("    *  *");
	   		System.out.println("  *  *  *");
	   		System.out.println(" *  *  *  *");
	   		System.out.println("*  *  *  *  *");
	        }
	       
	   	public static void dias() {

	   	System.out.println("domingo");
			System.out.println("segunda");
			System.out.println("terça");
			System.out.println("quarta");
			System.out.println("quinta");
			System.out.println("sexta");
			System.out.println("sabado");
	       
}
}