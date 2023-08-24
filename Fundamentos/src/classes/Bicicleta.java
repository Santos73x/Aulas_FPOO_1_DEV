
package classes;


public class Bicicleta {
    //atributos , são as caracteristicas da bicicleta
    private int qtddeRoda;
    private boolean marchas;
    private int qtdemarcha;
    private String modelo;
    private boolean temfreio;
    private String cor;
    private String situacao;
    private int velocidade;

    //construtor sem argumentos
    public Bicicleta() {
        
    }
    //construtor com argumentos

    public Bicicleta(int qtddeRoda, boolean marchas, int qtdemarcha, String modelo, boolean temfreio, String cor) {
        this.qtddeRoda = qtddeRoda;
        this.marchas = marchas;
        this.qtdemarcha = qtdemarcha;
        this.modelo = modelo;
        this.temfreio = temfreio;
        this.cor = cor;
        this.situacao = "parada";
        this.velocidade = 0;
    }
    // Ações da bicicleta
    public  void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade += velocidade;
        
    }   
    public void freiar(){
    this.situacao = "Freiando";
    this.velocidade -= 1;
    }
    
    public boolean verificarFreio(){
        return this.temfreio;
        
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtddeRoda=" + qtddeRoda + ", marchas=" + marchas + ", qtdemarcha=" + qtdemarcha + ", modelo=" + modelo + ", temfreio=" + temfreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    
    
}
