package collectional.composite;

import java.util.ArrayList;

public class Carpeta extends Archivo{
    private ArrayList<Archivo> archivos;
    public Carpeta() {
        archivos = new ArrayList<Archivo>();
    }
    public int getCantidadDeHojas() {
        int cantidad = 0;
        for (Archivo archivo: archivos) {
            cantidad += archivo.getCantidadDeHojas();
        }
        return cantidad;
    }
    public void addArchivo(Archivo archivo) {
        archivos.add(archivo);
    }
}
