/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class carro {

    private int qntderodas;
    private String marca;
    private int ano;
    private String Modelo;
    private CorEnum cor;
    private int marcha;

    public carro(int qntderodas, String marca, int ano, String Modelo, CorEnum cor, int marcha) {
        this.qntderodas = qntderodas;
        this.marca = marca;
        this.ano = ano;
        this.Modelo = Modelo;
        this.cor = cor;
        this.marcha = marcha;
    }

    public void trocarDeMarcha(MarchaEnum novamarcha) {
        int diferenca = novamarcha.getNumeromarcha() - this.marcha;
        if (diferenca == 1) {
            this.marcha = novamarcha.getNumeromarcha();
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }
    }

    @Override
    public String toString() {
        return "carro{" + "qntderodas=" + qntderodas + ", marca=" + marca + ", ano=" + ano + ", Modelo=" + Modelo + ", cor=" + cor + ", marcha=" + marcha + '}';
    }

}
