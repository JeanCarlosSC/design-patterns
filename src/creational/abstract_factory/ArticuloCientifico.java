package creational.abstract_factory;

public class ArticuloCientifico extends Texto {
    public ArticuloCientifico(String nombre) {
        super("Tipo: Articulo cientifico."+
                "\nNombre: \""+nombre+"\".");
    }
}
