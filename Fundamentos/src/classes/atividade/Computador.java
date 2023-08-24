/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Computador {
    public static void main(String[] args) {
        atividade02 computadors = new atividade02(EnumMemoria.OITOGIGAS, EnumProcessador.INTEL_CORE_i9, 500, "Linux");
        System.out.println(computadors);
        atividade02 computadors2 = new atividade02(EnumMemoria.DOZEGIGAS, EnumProcessador.INTEL_CORE_i5_13600K, 250, "Windows");
        System.out.println(computadors2);
        atividade02 computadors3 = new atividade02(EnumMemoria.OITOGIGAS, EnumProcessador.INTEL_CORE_i9, 10000, "Linux");
        System.out.println(computadors3);   
    
    }
}
