package creational.builder;

public class Director {
    public void construir(PBuilder pBuilder, int idPrestamista) {
        pBuilder.crearIDPrestamista(idPrestamista);
        pBuilder.crearOrigen();
        pBuilder.crearIDPrestamo();
    }
}
