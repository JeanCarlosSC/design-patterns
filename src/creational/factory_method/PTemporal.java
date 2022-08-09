package creational.factory_method;

public class PTemporal extends Profesor{
    public PTemporal(String nombre) {
        super(nombre);
    }
    public String getEstado() {
        return "profesor temporal";
    }
}
