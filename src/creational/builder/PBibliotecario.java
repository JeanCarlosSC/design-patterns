package creational.builder;

public class PBibliotecario extends PBuilder{
    @Override
    public void crearIDPrestamista(int id) {
        prestamo.setID("CC."+id);
    }

    @Override
    public void crearOrigen() {
        prestamo.setOrigen("Institucion externa");
    }
}
