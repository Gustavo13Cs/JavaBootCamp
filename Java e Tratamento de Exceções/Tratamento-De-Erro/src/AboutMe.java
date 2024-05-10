import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner 

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite seu idade ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá. me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho "+ idade + " anos ");
        System.out.println("Minha altura é  "+ altura + " cm ");
        scanner.close();
        } 
        catch (InputMismatchException e) {
            System.err.print("Idade e Altura precisam ser numericos");
        }
    }
}
