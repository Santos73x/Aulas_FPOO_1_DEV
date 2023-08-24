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
    }
}
