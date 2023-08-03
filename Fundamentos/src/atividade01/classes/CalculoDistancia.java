package atividade01.classes;
import java.util.Scanner;
public class CalculoDistancia {
   public static void main(String[] args) {
        double PreçoInferior200KM = 0.50;
        double PreçoSuperior200KM = 0.45;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distancia da viagem em km: ");
        double distanciaViagem = scanner.nextDouble();

        double precoPassagem;

        if (distanciaViagem <= 200) {
            precoPassagem = distanciaViagem * PreçoInferior200KM;
        } else {
            precoPassagem = distanciaViagem * PreçoSuperior200KM;
        }
        System.out.println("Distancia da viagem: " + distanciaViagem + " km");
        System.out.println("Preco da passagem: " + precoPassagem);
    }
}

