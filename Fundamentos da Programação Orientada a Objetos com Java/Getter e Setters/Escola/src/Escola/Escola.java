package Escola;

public class Escola {

    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe");
        felipe.setIdade(8);
    
        System.out.println("o aluno " + felipe.getName() + "tem " + felipe.getIdade() + "anos");
    }

}
