package collectional.flyweight;

public class ColeccionFlyweight {
    private CCientifica cCientifica;
    private CLiteraria cLiteraria;
    private CPolitica cPolitica;

    public ColeccionFlyweight(CCientifica cCientifica, CLiteraria cLiteraria, CPolitica cPolitica) {
        this.cCientifica = cCientifica;
        this.cLiteraria = cLiteraria;
        this.cPolitica = cPolitica;
    }

    public CCientifica getCCientifica() {
        return cCientifica;
    }

    public CLiteraria getCLiteraria() {
        return cLiteraria;
    }

    public CPolitica getCPolitica() {
        return cPolitica;
    }
}

