package lista24;

public class Gerente extends funcionario {

    private String departamento;
public double calcularSalario() {
	return getSalario() * 1.2;
	

}
public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
public void gerenciar() {
	System.out.println(getNome()+ "gerencia" + departamento);
}
}




