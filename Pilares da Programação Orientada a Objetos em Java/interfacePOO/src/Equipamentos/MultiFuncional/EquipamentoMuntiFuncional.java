package Equipamentos.MultiFuncional;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMuntiFuncional implements Copiadora,Digitalizadora,Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

}
