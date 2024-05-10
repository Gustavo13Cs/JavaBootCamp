public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatadorCep("49200000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExepection e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

    static String formatadorCep(String cep) throws CepInvalidoExepection{
        if (cep.length() != 8) {
            throw new CepInvalidoExepection();
        }
        //simulando um cep formatado
        return "49.200-000";
    }
}
