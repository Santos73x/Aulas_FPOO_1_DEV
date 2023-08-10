package aulaestruturadecisao;
import java.util.Scanner;
public class atividade02 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura  em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento em metros: ");
        double comprimento = scanner.nextDouble();

        double areaTotal = largura * comprimento;
        double valorMetroQuadrado;

        if (areaTotal <= 250) {
            valorMetroQuadrado = 8.50;
        } else if (areaTotal <= 350) {
            valorMetroQuadrado = 9.50;
        } else {
            valorMetroQuadrado = 11.50;
        }

        double valorTotal = areaTotal * valorMetroQuadrado;

        System.out.println("Área do terreno: " + areaTotal + " m²");
        System.out.println("Valor por m²: R$" + valorMetroQuadrado);
        System.out.println("Valor total a ser pago: R$" + valorTotal);

        scanner.close();
    }
}
