package Singleton;

// Singleton Preguiçoso
public class SingletonLazy {

    private static SingletonLazy instancia;

    //garantindo que ngm fora da classe instancie ela 
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
