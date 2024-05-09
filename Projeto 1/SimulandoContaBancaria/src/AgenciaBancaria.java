public class AgenciaBancaria {

    private String numeroAgencia;
    private String numeroConta;
    private double saldo;
    private String nomeDoCliente;

    // Construtor para inicializar os dados da agência
    public AgenciaBancaria(String numeroAgencia, String numeroConta, double saldo, String nomeDoCliente) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeDoCliente = nomeDoCliente;
    }

    // Método para exibir os dados da agência
    public void mostrarDados() {
        System.out.println("----- Dados da Agência Bancária -----");
        System.out.println("Número da Agência: " + numeroAgencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Cliente: " + nomeDoCliente);
        System.out.println("Saldo: R$" + saldo);
    }

}
