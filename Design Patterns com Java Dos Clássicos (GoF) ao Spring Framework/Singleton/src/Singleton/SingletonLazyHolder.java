package Singleton;

// Singleton Lazy Holder
public class SingletonLazyHolder {

    private static class InstanciaHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    //garantindo que ngm fora da classe instancie ela 
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanciaHolder.instancia;
    }
}
