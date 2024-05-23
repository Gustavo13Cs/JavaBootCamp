import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
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


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Develiper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGustavo.getConteudiosIncritos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudiosIncritos());
    }
}
