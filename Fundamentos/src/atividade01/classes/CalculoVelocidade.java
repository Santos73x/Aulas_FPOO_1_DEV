package atividade01.classes;
import java.util.Scanner;
public class CalculoVelocidade {
    public static void main(String[] args) {
         int VelocidadeMaxima = 80;
        double MultaPorKM = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (em km/h): ");
        int velocidadeCarro = scanner.nextInt();


        if (velocidadeCarro > VelocidadeMaxima) {
            int kmAcima = velocidadeCarro - VelocidadeMaxima;
           
            double valorMulta = kmAcima * MultaPorKM;
           
            System.out.println("Motorista multado");
            System.out.println("Velocidade registrada: " + velocidadeCarro + " km/h");
            System.out.println("Velocidade maxima permitida: " + velocidadeCarro + " km/h");
            System.out.println("Você ultrapassou " + kmAcima + " km/h da velocidade maxima.");
            System.out.println("Valor da multa:" + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }
    }
}
    

