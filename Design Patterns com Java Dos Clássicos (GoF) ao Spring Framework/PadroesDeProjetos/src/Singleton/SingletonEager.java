package Singleton;

// apressado
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    //garantindo que ngm fora da classe instancie ela 
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
