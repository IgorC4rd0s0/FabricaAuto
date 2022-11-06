package Automovel;
public class Carro extends Automovel {
    private Boolean tetoSolar;
    private Boolean aberto;
    private Boolean portaAberta;   
    

    public Carro () {
        super();
    }

    public Carro(Boolean tetoSolar, Boolean aberto, Boolean portaAberta) {
        this.tetoSolar = tetoSolar;
        this.aberto = aberto;
        this.portaAberta = portaAberta;        
    }

    public String abrirFechar () {
        if (this.portaAberta) {
            return "Carro fechado";
        }
        this.portaAberta = false;
        return "Carro aberto";
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
    
    public Boolean getportaAberta() {
        return this.portaAberta;
    }

    public void setportaAberta(Boolean portaAberta) {
        this.portaAberta = portaAberta;
    }
}
