package creational.builder;

public class PInterbibliotecario extends PBuilder {
    @Override
    public void crearIDPrestamista(int id) {
        prestamo.setID("UD."+id);
    }

    @Override
    public void crearOrigen() {
        prestamo.setOrigen("Universidad Distrital Francisco Jose de Caldas");
    }
}
