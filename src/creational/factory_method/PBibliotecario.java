package creational.factory_method;

public class PBibliotecario extends Prestamo {
    private int tiempoDePrestamo;
    public PBibliotecario(String isbn) {
        super(isbn);
        tiempoDePrestamo = 14;
    }
    public String getDetalles() {
        return super.getDetalles()+"\nTiempo de prestamo: "+tiempoDePrestamo+" dias.";
    }
}
