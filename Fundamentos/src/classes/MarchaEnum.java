/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarchaEnum {
    PRIMEIRA_MARCHA("primeira marcha", 1) ,
    SEGUNDA_MARCHA("segunda marcha", 2),
    TERCEIRA_MARCHA("terceiro marcha", 3),
    QUARTA_MARCHA("quarta marcha", 4) ,
    QUINTA_MARCHA("quinta marcha", 5) , 
    MARCHA_RE ("marcha re", -1),
    NEUTRA("neutra", 0);
    
    private String marcha;
private int numeromarcha;

    private MarchaEnum(String marcha, int numeromarcha) {
        this.marcha = marcha;
        this.numeromarcha = numeromarcha;
    }

    public String getMarcha() {
        return marcha;
        
    }

    public int getNumeromarcha() {
        return numeromarcha;
    }
    
    
    
}
