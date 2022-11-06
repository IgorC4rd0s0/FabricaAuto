package Automovel;
public class Carro extends Automovel {
    private Boolean tetoSolar;
    private Boolean aberto;    
    

    public Carro () {
        super();
    }

    public Carro(Boolean tetoSolar, Boolean aberto) {
        this.tetoSolar = tetoSolar;
        this.aberto = aberto;
    }

    public Boolean isTetoSolar() {
        return this.tetoSolar;
    }

    public Boolean getTetoSolar() {
        return this.tetoSolar;
    }

    public void setTetoSolar(Boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public Boolean isAberto() {
        return this.aberto;
    }

    public Boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }
}
