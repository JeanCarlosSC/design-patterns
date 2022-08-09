package creational.factory_method;

public class PDePlanta extends Profesor{
    public PDePlanta(String nombre) {
        super(nombre);
    }
    public String getEstado() {
        return "profesor de planta";
    }
}
