package QueOutfit;

import QueOutfit.PrendasElementos.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryClothes {
    PrendaBase base;

    public Prenda getRemeraBlanca(){
        base= new PrendaBase(ETipo.REMERA, EMaterial.ALGODON);
        return new Prenda(base, ETrama.LISA,Color.blanco());
    }
    public Prenda getJean(){
        base= new PrendaBase(ETipo.PANTALON,EMaterial.JEAN);
        return new Prenda(base,ETrama.LISA,Color.azul());
    }
    public Prenda getJoggin(){
        base= new PrendaBase(ETipo.PANTALON,EMaterial.ALGODON);
        return new Prenda(base,ETrama.LISA,Color.gris());
    }
    public Prenda getCamperaJean(){
        base= new PrendaBase(ETipo.CAMPERA,EMaterial.JEAN);
        return new Prenda(base,ETrama.LISA,Color.azul());
    }
    public Prenda getSweater(){
        base= new PrendaBase(ETipo.SWEATER,EMaterial.LANA);
        return new Prenda(base,ETrama.LISA,Color.azul());
    }
    public Prenda getBufandaLana(){
        base= new PrendaBase(ETipo.BUFANDA,EMaterial.LANA);
        return new Prenda(base,ETrama.CUADROS,Color.red());
    }
    public Prenda getGuantesLana(){
        base= new PrendaBase(ETipo.GUANTES,EMaterial.ALGODON);
        return  new Prenda(base,ETrama.LISA,Color.verde());
    }
    public Prenda getZapatillasBlancas(){
        base= new PrendaBase(ETipo.ZAPATILLAS,EMaterial.CUERINA);
        return  new Prenda(base,ETrama.LISA,Color.blanco());
    }
    public Prenda getZapatosNegros(){
        base= new PrendaBase(ETipo.ZAPATOS,EMaterial.CUERO);
        return  new Prenda(base,ETrama.LISA,Color.negro());
    }
    public Prenda getAnteojosDeSol(){
        base= new PrendaBase(ETipo.ANTEOJOS_DE_SOL,EMaterial.PLASTICO);
        return  new Prenda(base,ETrama.LISA,Color.negro());
    }
    public Prenda getCamisa(){
        base= new PrendaBase(ETipo.CAMISA,EMaterial.SEDA);
        return  new Prenda(base,ETrama.LISA,Color.negro());
    }
    public Atuendo getAtuendoEjemplo(){
        List<Prenda> prendas= new ArrayList<>();
        prendas.add(getJean());
        prendas.add(getRemeraBlanca());
        prendas.add(getZapatillasBlancas());
        prendas.add(getAnteojosDeSol());
        return new Atuendo(prendas);
    }

}
