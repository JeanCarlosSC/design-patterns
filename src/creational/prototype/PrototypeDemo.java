package creational.prototype;

public class PrototypeDemo {
    public static void main (String[] args) {
        PrototypeDemo.execute();
    }
    public static void execute() {
        UserManager manager = new UserManager();
        Usuario prototipo = new Usuario(
                "",
                "",
                "Universidad distrital Francisco Jose de Caldas",
                "Facultad de ingenieria",
                0
                );
        manager.setUserPrototype(prototipo);

        Usuario jean = manager.getNuevoUsuario();
        jean.setNombre("Jean Carlos Santoya Cabrera");
        jean.setCodigo("20191020156");

        Usuario santiago = manager.getNuevoUsuario();
        santiago.setNombre("David Santiago Pinzon Mahecha");
        santiago.setCodigo("20201020028");

        System.out.println("Usuarios registrados\n");
        System.out.println(jean.toString());
        System.out.println();
        System.out.println(santiago.toString());

    }
}
