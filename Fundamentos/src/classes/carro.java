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
    private  int qntderodas;
    private String marca;
    private int ano;
    private String Modelo;
    private String cor;

    public carro(int qntderodas, String marca, int ano, String Modelo, String cor) {
        this.qntderodas = qntderodas;
        this.marca = marca;
        this.ano = ano;
        this.Modelo = Modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "carro{" + "qntderodas=" + qntderodas + ", marca=" + marca + ", ano=" + ano + ", Modelo=" + Modelo + ", cor=" + cor + '}';
    }
    
    
}
