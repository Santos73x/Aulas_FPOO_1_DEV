package atividade01.classes;

import java.util.Scanner;

public class CalculoDeSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario ");
        int salario = scanner.nextInt();
        double aumento = 1.10;
        double menos = 1.15;
        if (salario > 1350) {
            double resultado1 = aumento * salario;
            System.out.println("O aumento foi de " + resultado1);
        } 
        else {
            double resultado2 = menos * salario;
            System.out.println("O aumento foi de " + resultado2);
        }
        
    }
}
