package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe","GUSTAVO","JULIA","JAM","ANNA"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas <3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "TENTATIVA");
        }
        else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " " + "REALIZADA");
        }
    }

    //metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe","GUSTAVO","JULIA","JAM","ANNA","ADSON","KAUAN"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O condidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void imprimirSelecionados() {

        String [] candidatos = {"Felipe","GUSTAVO","JULIA","JAM","ANNA"};

        System.out.println("Imprimindo a lista de candidatos informado o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("o candidato de n " + (i+1) + " " + "é " + candidatos[i]);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CONDIDATO");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CONDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
