package creational.singleton;

import java.util.ArrayList;
import java.util.Comparator;

public class Datos {
    private static Datos datos;
    private ArrayList<String> titulos;
    private Datos() {
        titulos = new ArrayList<>();
    }
    public ArrayList<String> getTitulos() {
        return titulos;
    }
    public void addTitulo(String titulo) {
        titulos.add(titulo);
        titulos.sort(Comparator.naturalOrder());
    }
    public static Datos getInstance() {
        if(datos == null)
            datos = new Datos();
        return datos;
    }
}
