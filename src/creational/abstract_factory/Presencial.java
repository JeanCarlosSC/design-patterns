package creational.abstract_factory;

public class Presencial extends Modalidad {
    public Presencial() {
        super();
    }
    @Override
    public void registrarTexto(String nombre) {
        recursos.add(new Libro(nombre));
    }
    @Override
    public void registrarAudiovisual(String nombre) {
        recursos.add(new Documental(nombre));
    }
}
