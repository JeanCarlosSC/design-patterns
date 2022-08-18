package collectional.composite;

public class Registro extends Archivo{
    private int cantidadDeHojas;
    public Registro(int cantidad) {
        cantidadDeHojas = cantidad;
    }
    @Override
    public int getCantidadDeHojas() {
        return cantidadDeHojas;
    }
}
