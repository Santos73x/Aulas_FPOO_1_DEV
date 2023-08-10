package aulaestruturadecisao;
import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha um dos cargo:");
        System.out.println("1. Gerente");
        System.out.println("2. Supervisor");
        System.out.println("3. Técnico");
        System.out.println("4. Auxiliar");
        System.out.print("Digite o numero do seu cargo: ");
        int escolhaCargo = scanner.nextInt();

        double salario, inss, convenio;

        switch (escolhaCargo) {
            case 1:
                salario = 5590.00;
                inss = 8;
                convenio= 289.00;
                break;
            case 2:
                salario = 4128.00;
                inss = 7;
                convenio = 239.00;
                break;
            case 3:
                salario = 3789.00;
                inss = 4;
               convenio = 189.00;
                break;
            case 4:
                salario = 2345.00;
                inss = 2;
              convenio  = 156.00;
                break;
            default:
                System.out.println("Escolha um dos cargos entre esses 4");
                scanner.close();
                return;
        }

        double desconto = salario * (inss / 100);
        double salariototal = salario - desconto - convenio;

       
        
        System.out.println("Seu salario e igual a " + salariototal);

        scanner.close();
    }
        
    
}
