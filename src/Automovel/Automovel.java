package Automovel;



public class Automovel {
    private String cor;
    private String placa;
    private String modelo;
    private Boolean ligado;
    private Boolean movimento;
    
    
    public String ligar () {
        if (this.ligado) {
            return "O veiculo" + this.modelo + "já esta ligado.";
        }
        this.ligado = true;
        return "O veiculo" + this.modelo + "foi ligado.";
    }

    public String mover () {
        if (this.ligado) {
            return "O veiculo esta em movimento";
        }
        this.ligado = false;
        return "o veiculo deve ser ligado para entrar em movimento";
    }
    
    public String parado () {
        if (this.movimento) {
          return  "o veiculo nao deve estar em movimento";
        }
        this.movimento = false;
        return "o veiculo se encontra parado";
    }
    
    

    public Automovel(String cor, String placa, String modelo, Boolean ligado, Boolean movimento) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = ligado;
        this.movimento = movimento;
    }
        
    

    public Automovel() {
    }


    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean isLigado() {
        return this.ligado;
    }

    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean isMovimento() {
        return this.movimento;
    }

    public Boolean getMovimento() {
        return this.movimento;
    }

    public void setMovimento(Boolean movimento) {
        this.movimento = movimento;
    }

}