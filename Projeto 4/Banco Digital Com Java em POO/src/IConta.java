public interface IConta {

    //um metodo na interface sempre e public ent n precisa colocar public na frente
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor,Conta contaDestino);

    void ImprimirExtrato();
}
