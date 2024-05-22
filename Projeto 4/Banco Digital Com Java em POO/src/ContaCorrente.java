public class ContaCorrente extends Conta {

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== CONTA CORRENTE ===");
        super.ImprimirInfosComuns();
    }
    
}
