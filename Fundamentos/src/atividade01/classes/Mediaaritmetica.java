package atividade01.classes;

public class Mediaaritmetica {
    public static void main(String[] args) {
              double media = calcularMedia(5.0, 10.0, 15.0, 20.0);
        System.out.println("A media aritmetica e: " + media);
    }

    public static double calcularMedia(double... valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }

        return soma / valores.length;
    }
    }

