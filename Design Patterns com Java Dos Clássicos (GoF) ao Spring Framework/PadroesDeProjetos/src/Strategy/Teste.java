package Strategy;

public class Teste {
    public static void main(String[] args) {

        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoaAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
    }
}
