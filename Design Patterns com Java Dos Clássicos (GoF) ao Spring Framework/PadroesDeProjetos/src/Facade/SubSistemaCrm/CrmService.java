package Facade.SubSistemaCrm;

public class CrmService {

    private CrmService() {
        super();
    }
    public static void gravarCliente(String nome,String Cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(nome);
        System.out.println(Cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
