package QueOutfit;

import QueOutfit.PrendasElementos.*;
import QueOutfit.SugerenciasElementos.Atuendo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AtuendoTest {
    FactoryClothes factoryClothes= new FactoryClothes();
    List<Prenda> prendas= new ArrayList<>();
    Atuendo atuendo;
    @Before
    public void inicializacion(){
        prendas.add(factoryClothes.getJean());
        prendas.add(factoryClothes.getRemeraBlanca());
        prendas.add(factoryClothes.getZapatillasBlancas());
        prendas.add(factoryClothes.getAnteojosDeSol());
        atuendo= new Atuendo(prendas);
    }

    @Test
    public void sePuedeCrearUnAtuendo(){
        Atuendo atuendo= new Atuendo(prendas);
    }
    @Test
    public void sePuedeAgregarUnaCampera(){
        assert (atuendo.compatibleConPrenda(factoryClothes.getCamperaJean()));
    }

}
