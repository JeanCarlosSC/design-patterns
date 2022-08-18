package collectional.flyweight;

public class FlyweightDemo {
    public static void main (String[] args) {
        FlyweightDemo.execute();
    }
    public static void execute() {
        ColeccionFactory coleccionFactory = new ColeccionFactory();

        CPolitica cPolitica1 = new CPolitica("La constitucion politica");
        CPolitica cPolitica2 = new CPolitica("Derechos y deberes de los estudiantes");
        CLiteraria cLiteraria = new CLiteraria("Libros al viento");

        CCientifica cCientifica1 = new CCientifica("Fisica universitaria");
        CCientifica cCientifica2 = new CCientifica("Calculo de varias variables");

        Coleccion coleccion1 = new Coleccion(cCientifica1, cLiteraria, cPolitica1,   1);
        Coleccion coleccion2 = new Coleccion(cCientifica2, cLiteraria, cPolitica1,  2);
        Coleccion coleccion3 = new Coleccion(cCientifica1, cLiteraria, cPolitica2,  3);
        Coleccion coleccion4 = new Coleccion(cCientifica2, cLiteraria, cPolitica2, 4);
        Coleccion coleccion5 = new Coleccion(cCientifica2, cLiteraria, cPolitica1, 5);
        Coleccion coleccion6 = new Coleccion(cCientifica1, cLiteraria, cPolitica2, 6);
        Coleccion coleccion7 = new Coleccion(cCientifica1, cLiteraria, cPolitica1, 7);

        System.out.println("" + coleccion1 + coleccion2 + coleccion3 + coleccion4 + coleccion5 + coleccion6 + coleccion7);

    }
}
