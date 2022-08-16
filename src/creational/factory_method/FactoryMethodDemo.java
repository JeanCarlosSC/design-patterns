package creational.factory_method;

public class FactoryMethodDemo {
    public static void main (String[] args) {
        FactoryMethodDemo.execute();
    }
    public static void execute() {
        Prestamo prestamo1 = PrestamoFactory.crearPrestamo("9780571295692", true);
        System.out.println("\nLos detalles del prestamo 1 son:\n"+prestamo1.getDetalles());

        Prestamo prestamo2 = PrestamoFactory.crearPrestamo("9782918767763", false);
        System.out.println("\nLos detalles del prestamo 2 son:\n"+prestamo2.getDetalles());
    }
}
