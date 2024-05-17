public class SIstemaDeCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema 
        Pessoa marcos = new Pessoa("123", "Marcos");

        //definimos o endereço de marcos
        marcos.SetEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
}
