package aulaestruturadecisao;
import java.util.Scanner;
public class atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir os valores e percentuais dos itens
        double valorNotebook = 3299.00;
        double valorCelular = 1789.00;
        double valorCarro = 68000.00;
        double valorApartamento = 180000.00;

        double percentualEconomiaNotebook = 0.05;
        double percentualEconomiaCelular = 0.1;
        double percentualEconomiaCarro = 0.02;
        double percentualEconomiaApartamento = 0.01;

        // Entrada do valor que você planeja economizar por mês
        System.out.print("Informe o valor que você planeja economizar por mês: ");
        double valorEconomiaMensal = scanner.nextDouble();

        // Cálculo da quantidade de meses para cada item
        int mesesNotebook = calcularMeses(valorNotebook, percentualEconomiaNotebook, valorEconomiaMensal);
        int mesesCelular = calcularMeses(valorCelular, percentualEconomiaCelular, valorEconomiaMensal);
        int mesesCarro = calcularMeses(valorCarro, percentualEconomiaCarro, valorEconomiaMensal);
        int mesesApartamento = calcularMeses(valorApartamento, percentualEconomiaApartamento, valorEconomiaMensal);

        // Saída dos resultados
        System.out.println("Quantidade de meses para comprar cada item:");
        System.out.println("Notebook Lenovo: " + mesesNotebook + " meses");
        System.out.println("Celular MotoG22: " + mesesCelular + " meses");
        System.out.println("Carro Hb20: " + mesesCarro + " meses");
        System.out.println("Apartamento: " + mesesApartamento + " meses");

        scanner.close();
    }

    public static int calcularMeses(double valorTotal, double percentualEconomia, double valorEconomiaMensal) {
        int meses = 0;
        double valorAcumulado = 0.0;

        while (valorAcumulado < valorTotal) {
            valorAcumulado += valorEconomiaMensal;
            valorAcumulado += valorAcumulado * percentualEconomia;
            meses++;
        }

        return meses;
    }
}
