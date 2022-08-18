package creational.builder;

public abstract class PBuilder {
    protected Prestamo prestamo;
    private static int nextIDPrestamo;

    public abstract void crearIDPrestamista(int id);
    public abstract void crearOrigen();

    public void crear() {
        prestamo = new Prestamo();
    }
    public void crearIDPrestamo() {
        nextIDPrestamo++;
        prestamo.setIDPrestamo(nextIDPrestamo);
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }
}
