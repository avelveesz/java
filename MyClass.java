
public class MyClass {
  public static void main(String args[]) {
    System.out.println("Olá mundo");
    // Variavéis 
    int idade = 24; // númesros inteiros 
    double salario = 1.75; // número quebrado
    char letra = 'j'; // letra ou simbolo 
    boolean estudante = true; // verdadeiro ou falso 
    // true ou false 
    String nome = "juliana"; // texto 
    System.out.println(idade);
    System.out.println ("minha idade é "  + idade);
    System.out.println ("o salario é " + salario);
    System.out.println ("a letra é " + letra);
    System.out.println (" estuda? " + estudante);
    System.out.println("meu nome é " + nome);
    
    // operadoes aritimeticos 
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    System.out.println (" soma " + soma);
    System.out.println (" subtração " + sub);
    System.out.println (" divisão " + div);
    System.out.println (" multiplicação " + mult);
    /*calculo da area de um retangulo*/ 
    /*largura * cumprimento*/
    double largura = 7.75;
    double cumprimento = 3.0;
    double area = largura * cumprimento;
    System.out.println (" area " + area);
    // calculo do desconto 
    double valor = 100;
    double desconto = 15; // 15%
    double valordesc = valor * (desconto / 100);
    double valorfinal = valor - valordesc;
    System.out.println (" a pagar " + valorfinal);
    
    }
}