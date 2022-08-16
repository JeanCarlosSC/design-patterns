package creational.abstract_factory;

public class AbstractFactoryDemo {
    public static void main (String[] args) {
        AbstractFactoryDemo.execute();
    }
    public static void execute() {
        Modalidad virtual = new Virtual();
        virtual.registrarTexto("Interpretacion matematica del Tao de Lao Tse");
        virtual.registrarAudiovisual("Curso para gestion de bases de datos en la nube con AWS y postgreeSQL.");
        System.out.println("Recursos virtuales:");
        for(Recurso recurso: virtual.getRecursos()) {
            System.out.println(recurso.getInfo());
        }

        Modalidad presencial = new Presencial();
        presencial.registrarTexto("Calculo de varias variables");
        presencial.registrarAudiovisual("El origen del universo");
        System.out.println("\nRecursos presenciales:");
        for(Recurso recurso: presencial.getRecursos()) {
            System.out.println(recurso.getInfo());
        }
    }
}
