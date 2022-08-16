package creational.abstract_factory;

public class Documental extends AudioVisual {
    public Documental(String nombre) {
        super("Tipo: Documental."+
                "\nNombre: \""+nombre+"\".");
    }
}
