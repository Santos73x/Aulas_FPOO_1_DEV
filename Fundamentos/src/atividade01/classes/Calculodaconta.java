package atividade01.classes;
import java.util.Scanner;
public class Calculodaconta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitario do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.print("Digite a forma de pagamento (D para débito, C para crédito): ");
        char formaPagamento = scanner.next().charAt(0);

        if (formaPagamento == 'D' || formaPagamento == 'd') {
            double desconto = valorTotal > 100 ? valorTotal * 0.03 : valorTotal * 0.05;
            valorTotal -= desconto;
        }

        if (formaPagamento == 'C' || formaPagamento == 'c') {
            System.out.print("A compra será parcelada? (S para sim, N para não): ");
            char parcelado = scanner.next().charAt(0);
            if (parcelado == 'S' || parcelado == 's') {
                System.out.print("Digite o número de parcelas: ");
                int numeroParcelas = scanner.nextInt();
                double valorParcela = valorTotal / numeroParcelas;
                System.out.println("Valor da parcela: R$" + valorParcela);
            }
        }

        System.out.println("Resumo da compra:");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor unitário: R$" + valorUnitario);
        System.out.println("Quantidade: " + quantidade);
       
        if (formaPagamento == 'D' || formaPagamento == 'd') {
            System.out.println("Total com desconto: R$" + valorTotal);
        } else {
            System.out.println("Total: R$" + valorTotal);
        }
    }
}

