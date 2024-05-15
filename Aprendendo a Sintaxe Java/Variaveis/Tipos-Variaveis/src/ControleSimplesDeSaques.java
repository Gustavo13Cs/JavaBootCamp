import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        int valorSaque = scanner.nextInt();
        for(int i = 0; i <= 5; i++) {

            if(valorSaque != 0 && valorSaque< limiteDiario){
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario + "\n" + " Transacoes encerradas.");
                break;
            }
            else if (valorSaque > limiteDiario) {
                System.out.print("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }

        scanner.close(); 
    }
}