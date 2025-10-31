package lista22;

public class ClasseMusica {
    String titulo;
    String artista;
    double duracao; // duração em minutos

    void tocar() {
        System.out.println("Tocando \"" + titulo + "\" de " + artista + "...");
    }

    void pausar() {
        System.out.println("Música pausada");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("------------------------------");
    }
}

