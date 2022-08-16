package creational.singleton;

public class SingletonDemo {
    public static void main (String[] args) {
        SingletonDemo.execute();
    }
    public static void execute() {
        System.out.println("\nLista de titulos");
        Datos datos = Datos.getInstance();
        datos.addTitulo("Calculo una variable");
        datos.addTitulo("Design patterns");
        for(String nombre: datos.getTitulos()) {
            System.out.println("\t"+nombre);
        }

        System.out.println("\nLista de titulos despues de agregar dos titulos");
        datos.addTitulo("Calculo de varias variables");
        datos.addTitulo("Ecuaciones diferenciales");
        Datos datos1 = Datos.getInstance();
        for(String nombre: datos1.getTitulos()) {
            System.out.println("\t"+nombre);
        }
    }
}
