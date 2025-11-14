package Lista25;

public class ContaPoupanca extends Conta {

    @Override
    public double calcularRendimento(double valor) {
        return valor * 1.05; 
    }
}
