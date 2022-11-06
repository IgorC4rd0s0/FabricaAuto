package Automovel;

public class Moto extends Automovel {

private Boolean freioAbs;
private Boolean bau; 

public Moto () {
    super();
}

    public Moto(Boolean freioAbs, Boolean bau) {
        this.freioAbs = freioAbs;
        this.bau = bau;
    }

    public Boolean isFreioAbs() {
        return this.freioAbs;
    }

    public Boolean getFreioAbs() {
        return this.freioAbs;
    }

    public void setFreioAbs(Boolean freioAbs) {
        this.freioAbs = freioAbs;
    }

    public Boolean isBau() {
        return this.bau;
    }

    public Boolean getBau() {
        return this.bau;
    }

    public void setBau(Boolean bau) {
        this.bau = bau;
    }


}
