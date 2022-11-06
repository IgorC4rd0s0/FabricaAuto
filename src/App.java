import Automovel.Automovel;
import Automovel.Carro;
import Automovel.Moto;

public class App {
    public static void main(String[] args){
        Automovel a1 = new Automovel(null, null, null, null, null);
        a1.setModelo("Gol");
        a1.setCor("branco");
        a1.setPlaca("hmx-4341");
        a1.setLigado(false);

        Carro c1 = new Carro(true, true, null);
        c1.setModelo("Celta");
        c1.setLigado(false);
        c1.setMovimento(false);
        c1.setportaAberta(false);
        
        Moto m1 = new Moto(null, null, null);
        m1.setAlarme(true);
        m1.setBau(true);
        m1.setFreioAbs(true);
        
        System.out.println(m1.alarme());
        
    }
}
