package creational.builder;

public class BuilderDemo {
    public static void main (String[] args) {
        BuilderDemo.execute();
    }
    public static void execute() {
        PBuilder pBibliotecario = new PBibliotecario();
        PBuilder pInterbibliotecario = new PInterbibliotecario();
        Director director = new Director();

        pBibliotecario.crear();
        director.construir(pBibliotecario, 4739890);
        System.out.println(pBibliotecario.getPrestamo().getDetalles());

        pInterbibliotecario.crear();
        director.construir(pInterbibliotecario, 2019020156);
        System.out.println(pInterbibliotecario.getPrestamo().getDetalles());
    }
}
