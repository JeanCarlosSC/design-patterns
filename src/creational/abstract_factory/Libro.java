package creational.abstract_factory;

public class Libro extends Texto {
    public Libro(String nombre) {
        super("Tipo: Libro."+
                "\nNombre: \""+nombre+"\".");
    }
}
