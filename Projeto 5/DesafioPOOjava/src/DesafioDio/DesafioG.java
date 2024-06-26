package DesafioDio;
import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class DesafioG {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
   CofreDigital cofreDigital = null;
      int senha = 0;
      // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
      if (tipoCofre.equalsIgnoreCase("digital")) {
        senha = scanner.nextInt();
        cofreDigital = new CofreDigital(senha);
        cofreDigital.imprimirInformacoes();
      }
      else if (tipoCofre.equalsIgnoreCase("fisico")) {
        CofreFisico cofreFisico = new CofreFisico();
        cofreFisico.imprimirInformacoes();
      }
      
      if (tipoCofre.equalsIgnoreCase("digital")) {
             int confirmacaoSenha = scanner.nextInt();
     
          if (cofreDigital.validarSenha(confirmacaoSenha)) {
          System.out.println("Cofre aberto!");
      } else {
          System.out.println("Senha incorreta!");
      }
       }
    

  }
}