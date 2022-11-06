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
        a1.setMovimento(false);

        Carro c1 = new Carro(true, true);
        c1.setModelo("Celta");
        c1.setLigado(false);

        System.out.println(c1.getModelo());
        System.out.println(c1.ligar());
    }
}
