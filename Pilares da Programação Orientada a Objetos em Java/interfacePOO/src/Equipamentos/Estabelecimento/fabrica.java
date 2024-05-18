package Equipamentos.Estabelecimento;

import Equipamentos.impressora.Deskjet;
import Equipamentos.impressora.Impressora;

public class fabrica {
    public static void main(String[] args) {
        
        Impressora impressora = new Deskjet();
        impressora.imprimir();
    }
}
