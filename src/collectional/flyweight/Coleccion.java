package collectional.flyweight;

public class Coleccion {
    private int codigo;
    private ColeccionFlyweight flyweight;

    public Coleccion(CCientifica cCientifica, CLiteraria cLiteraria, CPolitica cPolitica, int codigo) {
        flyweight = ColeccionFactory.getFlyweight(cCientifica, cLiteraria, cPolitica);
        this.codigo = codigo;
    }

    public CCientifica getCCientifica() {
        return flyweight.getCCientifica();
    }

    public CLiteraria getCLiteraria() {
        return flyweight.getCLiteraria();
    }

    public CPolitica getCPolitica() {
        return flyweight.getCPolitica();
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "\nColeccion cientifica: " + flyweight.getCCientifica().getNombre() +
                "\nColeccion literaria: " + flyweight.getCLiteraria().getNombre() +
                "\nColeccion politica: " + flyweight.getCPolitica().getNombre() +
                "\nCodigo: " + getCodigo() + "\n";
    }

}
