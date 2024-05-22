public class ContaPoupanca extends Conta {
    @Override
    public void ImprimirExtrato() {
        System.out.println("=== CONTA POUPANÇA ===");
        super.ImprimirInfosComuns();
    }
}
