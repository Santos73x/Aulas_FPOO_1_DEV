package aulaestruturadecisao;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("escolha um dos pratos:");
        System.out.println("1. Prato 1 Arroz, feijão, bife acebolado");
        System.out.println("2. Prato 2 Arroz, feijão, filé de frango   ");
        System.out.println("3. Prato 3 Arroz, feijão, brajola ");
        System.out.print("Digite o numero do seu prato: ");
        int escolhadoprato = scanner.nextInt();
        
        System.out.println("Quantos pessoas vão pedir o prato");
        int numerodpessoas = scanner.nextInt();
        
        double prato;
        switch(numerodpessoas) {
            case 1:
                prato = 19.99;
                break;
                  case 2:
             prato = 18.99;
                break;
            case 3:
                prato = 23.99;
                break;
                 default:
                System.out.println("Escolha um dos cargos entre esses 4");
                scanner.close();
                return;     
        }
        double preco = numerodpessoas*prato;
        System.out.println("o preco total foi de " + preco);
    }
}
