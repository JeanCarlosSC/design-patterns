package creational.factory_method;

public class FactoryMethodDemo {
    public static void main (String[] args) {
        FactoryMethodDemo.execute();
    }
    public static void execute() {
        Profesor jean = ProfesorFactory.crearProfesor("Jean Carlos", 5);
        System.out.println("El profesor "+jean.getNombre()+", es un "+jean.getEstado());
    }
}
