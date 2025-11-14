package Lista25;

public class Conta2 {

	public static void main(String[] args) {

        Conta poupanca = new ContaPoupanca();
        Conta investimento = new ContaInvestimento();

        double valorInicial = 1000;

        System.out.println("Rendimento Poupança: R$ " + poupanca.calcularRendimento(valorInicial));
        System.out.println("Rendimento Investimento: R$ " + investimento.calcularRendimento(valorInicial));
    }
}