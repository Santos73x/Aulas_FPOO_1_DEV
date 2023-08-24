package classes;

public class Bicicletaria {

    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 8, "Caloi Cross", true, "preta");

        System.out.println(caloiCross);
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        System.out.println(caloiCross);

        carro carrinho = new carro(4, "Bmw", 2008, "esportivo", CorEnum.AZUL, 0);

        carro carrinho2 = new carro(4, "Toyota", 2020, "esportivo", CorEnum.PRETO, 0    );
        System.out.println(carrinho2);

        carrinho.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        carrinho.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        carrinho.trocarDeMarcha(MarchaEnum.QUARTA_MARCHA);
        System.out.println(carrinho);

        aluno aluninho = new aluno(7, "claudio", "claudio12@gmail.com", 3345);
        aluno aluninho2 = new aluno(10, "Jose da manga", "josezinmanga@gmail.com", 007);

    }

}
