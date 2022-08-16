package creational.factory_method;

public abstract class Prestamo {
    private String isbn;

    public Prestamo(String isbn) {
        this.isbn = isbn;
    }
    public String getDetalles() {
        return "ISBN: "+isbn+".";
    }
}
