package edu.Gustavo.segundaSemana;
public class MinhaClasse {
    public static void main (String[] args) {
        String meuNome = "Gustavo";
        
        int anoFabricacao = 2024;

        boolean simNao;

        String primeiroNome = "Gustavo";
        String segundoNome = "Cunha";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // criando metodo 
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
