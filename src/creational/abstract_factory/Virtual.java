package creational.abstract_factory;

public class Virtual extends Modalidad{
    public Virtual() {
        super();
    }
    @Override
    public void registrarTexto(String nombre) {
        recursos.add(new ArticuloCientifico(nombre));
    }
    @Override
    public void registrarAudiovisual(String nombre) {
        recursos.add(new CursoOnline(nombre));
    }
}
