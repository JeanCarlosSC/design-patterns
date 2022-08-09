package creational.factory_method;

public abstract class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public abstract String getEstado();
}
