package Automovel;

public class Moto extends Automovel {

private Boolean freioAbs;
private Boolean bau;
private Boolean alarme; 

    public Moto(Boolean freioAbs, Boolean bau, Boolean alarme) {
        this.freioAbs = freioAbs;
        this.bau = bau;
        this.alarme = alarme;
    }

    public String alarme () {
        if (this.alarme) {
            return "alarme ligado";
        }
        this.alarme = false;
        return "O alarme esta desligado";
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

    public Boolean isAlarme() {
        return this.alarme;
    }

    public Boolean getAlarme() {
        return this.alarme;
    }

    public void setAlarme(Boolean alarme) {
        this.alarme = alarme;
    }


}
