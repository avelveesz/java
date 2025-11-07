package lista24;

import herança.aluno;
import herança.professor;

public class empresa {

	public static void main(String[] args) {
  Gerente g = new Gerente();
   g.setNome("Carlos");
   g.setSalario(5000);  
   g.setDepartamento("Financeiro");
	    
    Vendedor v = new Vendedor();
   v.setNome("Ana");
	        v.setSalario(3000);
	        v.setComissao(500);

	
	    System.out.println("Nome: " + g.getNome());
	     System.out.println("Salário base: " + g.getSalario());
	     System.out.println("Departamento: " + g.getDepartamento());
	     System.out.println("Salário final: " + g.calcularSalario());
	     g.gerenciar(); 

	        System.out.println();

	
     System.out.println("Nome: " + v.getNome());
     System.out.println("Salário base: " + v.getSalario());
	  System.out.println("Comissão: " + v.getComissao());
	   System.out.println("Salário final: " + v.calcularSalario());
	    v.vender(); 

	}

}
