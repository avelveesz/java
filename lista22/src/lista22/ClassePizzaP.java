package lista22;

public class ClassePizzaP {

	public static void main(String[] args) {
		ClassePizza pizza1 = new ClassePizza();
        pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        pizza1.bordaRecheada = true;

        pizza1.preparar();
        pizza1.assando();
        pizza1.mostrarInformacoes();

        // Segunda pizza
        ClassePizza pizza2 = new ClassePizza();
        pizza2.sabor = "Frango com Catupiry";
        pizza2.tamanho = "Média";
        pizza2.bordaRecheada = false;

        pizza2.preparar();
        pizza2.assando();
        pizza2.mostrarInformacoes();
    }
}
