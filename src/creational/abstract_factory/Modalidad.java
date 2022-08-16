package creational.abstract_factory;

import java.util.ArrayList;

public abstract class Modalidad {
    protected ArrayList<Recurso> recursos;
    public Modalidad() {
        recursos = new ArrayList<>();
    }
    public abstract void registrarTexto(String nombre);

    public abstract void registrarAudiovisual(String nombre);

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }
}
