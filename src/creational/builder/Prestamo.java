package creational.builder;

public class Prestamo {
    private String idPrestamista;
    private String origen;
    private int idFactura;

    public void setID(String id) {
        idPrestamista = id;
    }

    public void setIDPrestamo(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getDetalles() {
        return "ID del prestamo: "+idFactura+".\n"+
                "ID del prestamista: "+idPrestamista+".\n"+
                "Origen: "+origen+".\n";
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
