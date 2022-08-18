package collectional.composite;

public class CompositeDemo {
    public static void main (String[] args) {
        CompositeDemo.execute();
    }
    public static void execute() {
        Carpeta normatividad = new Carpeta();
        Registro estatuto = new Registro(39);
        Registro constitucion = new Registro(61);
        normatividad.addArchivo(estatuto);
        normatividad.addArchivo(constitucion);

        Carpeta convenios = new Carpeta();
        Registro ceri = new Registro(7);
        Registro interbibliotecario = new Registro(3);
        convenios.addArchivo(ceri);
        convenios.addArchivo(interbibliotecario);

        Carpeta general = new Carpeta();
        general.addArchivo(normatividad);
        general.addArchivo(convenios);

        System.out.println("Hojas en la carpeta general de la biblioteca: "+general.getCantidadDeHojas());
    }
}
