package atividade01.classes;
import java.util.Scanner;
public class Energia {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o tipo de instalacao (r para residencia, i para industria, c para comercio): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double preco = 0.0;

        if (tipoInstalacao == 'r') {
            if (consumo <= 500) {
                preco = consumo * 0.40;
            } else {
                preco = consumo * 0.65;
            }
        } else if (tipoInstalacao == 'i') {
            if (consumo <= 1000) {
                preco = consumo * 0.55;
            } else {
                preco = consumo * 0.60;
            }
        } else if (tipoInstalacao == 'c') {
            if (consumo <= 5000) {
                preco = consumo * 0.55;
            } else {
                preco = consumo * 0.60;
            }
        } else {
            System.out.println("Tipo de instalacao invalido.");
            return;
        }

        System.out.println("O preco a pagar e: " + preco);
    }

}
