
package classes.atividade;

public class atividade02 {
    private EnumMemoria memoria;
    private EnumProcessador processador;
    private int CapacidadeDememoriaHD;
    private String Sistema;

    public atividade02(EnumMemoria memoria, EnumProcessador processador, int CapacidadeDememoriaHD, String Sistema) {
        this.memoria = memoria;
        this.processador = processador;
        this.CapacidadeDememoriaHD = CapacidadeDememoriaHD;
        this.Sistema = Sistema;
    }

    @Override
    public String toString() {
        return "atividade02{" + "memoria=" + memoria + ", processador=" + processador + ", CapacidadeDememoriaHD=" + CapacidadeDememoriaHD + ", Sistema=" + Sistema + '}';
    }
    
}
