package lista24;

public class Vendedor extends funcionario {

    private double comissao = 500;

    public double calcularSalario() {
        return getSalario() + comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void vender() {
        System.out.println(getNome() + " realizou uma venda!");
    }
}













