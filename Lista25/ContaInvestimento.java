package Lista25;

public class ContaInvestimento extends Conta {

    @Override
    public double calcularRendimento(double valor) {
        return valor * 1.10; 
    }
}
