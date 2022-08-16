package creational.factory_method;

public class PrestamoFactory {
    public static Prestamo crearPrestamo(String isbn, boolean esEstudiante) {
        if(esEstudiante) {
            return new PBibliotecario(isbn);
        }
        else {
            return new PInterbibliotecario(isbn);
        }
    }
}
