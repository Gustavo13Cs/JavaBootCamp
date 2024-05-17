public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    //metodo construtor
    // apenas use quando os atributos for necessario pra criar um objeto
    public Pessoa (String cpf,String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void SetEndereco(String endereco) {
        this .endereco = endereco;
    }


}
