package creational.prototype;

public class Usuario {
    private String nombre;
    private String codigo;
    private String institucion;
    private String facultad;
    private int multa;

    public Usuario(String nombre, String codigo, String institucion, String facultad, int multa) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.institucion = institucion;
        this.facultad = facultad;
        this.multa = multa;
    }

    public Usuario clone() {
        return new Usuario(nombre, codigo, institucion, facultad, multa);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public String toString() {
        return "Nombre: " + nombre + ".\n" +
                "Codigo: " + codigo + ".\n" +
                "Institucion: " + institucion + ".\n" +
                "Facultad: " + facultad + ".\n" +
                "Multa: " + multa + ".";
    }
}
