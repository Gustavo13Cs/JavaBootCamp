package Facade;

import Facade.SubSistemaCep.CepApi;
import Facade.SubSistemaCrm.CrmService;

public class Facade {
    public void migrarCliente(String nome,String Cep) {
       String cidade =  CepApi.getInstancia().recuperarCidade(Cep);
       String estado =  CepApi.getInstancia().recuperarEstado(Cep);

       CrmService.gravarCliente(nome, Cep, estado, cidade);
    }
}
