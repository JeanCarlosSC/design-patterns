package creational.factory_method;

public class ProfesorFactory {
    public static Profesor crearProfesor(String nombre, int tiempoEnLaU) {
        if(tiempoEnLaU < 5) {
            return new PTemporal(nombre);
        }
        else {
            return new PDePlanta(nombre);
        }
    }
}
