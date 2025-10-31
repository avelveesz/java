package lista22;

public class VideoGameP {

	public static void main(String[] args) {
	    ClasseVideoGame ps5 = new ClasseVideoGame();
        ps5.marca = "Sony";
        ps5.modelo = "PlayStation 5";

        ps5.verificarStatus();
        
        ps5.ligar();

        ps5.verificarStatus();
   
        ps5.desligar();
 
        ps5.verificarStatus();
    }
}
