package creational.abstract_factory;

public class Recurso {
    private String info;
    public Recurso(String info) {
        this.info = "\n"+info;
    }
    public String getInfo() {
        return info;
    }
}
