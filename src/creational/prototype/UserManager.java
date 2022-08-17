package creational.prototype;

public class UserManager {
    private Usuario userPrototype;

    public void setUserPrototype(Usuario userPrototype) {
        this.userPrototype = userPrototype;
    }

    public Usuario getNuevoUsuario() {
        return userPrototype.clone();
    }
}
