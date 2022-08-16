package creational.factory_method;

public class PInterbibliotecario extends Prestamo {
    private int tiempoDePrestamo;
    public PInterbibliotecario(String isbn) {
        super(isbn);
        tiempoDePrestamo = 7;
    }
    public String getDetalles() {
        return super.getDetalles()+"\nTiempo de prestamo: "+tiempoDePrestamo+" dias.";
    }
}
