/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class atividade01 {
    private int numeroDcadeiras;
    private int numeroDmesas;
    private int numeroDaSala;
    private boolean projetor;
    private int numeroDcomputadores;

    @Override
    public String toString() {
        return "atividade01{" + "numeroDcadeiras=" + numeroDcadeiras + ", numeroDmesas=" + numeroDmesas + ", numeroDaSala=" + numeroDaSala + ", projetor=" + projetor + ", numeroDcomputadores=" + numeroDcomputadores + '}';
    }

    public atividade01(int numeroDcadeiras, int numeroDmesas, int numeroDaSala, boolean projetor, int numeroDcomputadores) {
        this.numeroDcadeiras = numeroDcadeiras;
        this.numeroDmesas = numeroDmesas;
        this.numeroDaSala = numeroDaSala;
        this.projetor = projetor;
        this.numeroDcomputadores = numeroDcomputadores;
    }
    
    
}
