import java.time.LocalDate;

import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricacao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso1.setTitulo("Curso jS");
        curso1.setDescricao("descricacao curso js");
        curso1.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
