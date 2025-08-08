

public class MyClass {
  public static void main(String args[]) {
      //1 - Cálculo para empresa 
double serviço1 = 300.00; // número quebrado
double serviço2 = 150.00; // número quebrado
double serviço3 = 499.99; // número quebrado
double pagar = serviço1+ serviço2 + serviço3;
System.out.println ("cliente deverá pagar: " + pagar );
//2 - Cálculo de salário 
double recebe = 35.00;
int horas = 8;
double receber = recebe * horas;
System.out.println (" No final de um dia ele deve receber:" + receber);
 //3 - Caixas de bombons
     int bombom = 27;
     int caixas = 16;
     int totalDoces = bombom * caixas;
      System.out.println ("Pamela ficou com " + totalDoces + " bombons");
     
     //4 - Garrafas de água
     int garrafas = 300;
     int caixa = 20;
     int usaram = garrafas / caixa;
     System.out.println ("Eles usaram " + usaram + " caixas");
     
     //5 - Cálculo para camisetas 
     double comprou = 120;
     double vendeu = 80;
     double comprouMais = 50;
     double camiseta = 30.00;
     double restou = (comprou - vendeu) + comprouMais;
     double faturamento = vendeu * camiseta;
     System.out.println ("O faturamento foi de " + faturamento + " reais, e sobrou " + restou + " camisetas");
      
     //6 - Dobro e Metade
     double x = 10;
     double dobro = x * 2;
     double metade = x / 2;
     System.out.println ("A variável é 10, seu dobro é " + dobro + " e sua metade é " + metade);

}
}