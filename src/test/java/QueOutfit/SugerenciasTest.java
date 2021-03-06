package QueOutfit;

import QueOutfit.Clima.Clima;
import QueOutfit.PrendasElementos.*;
import QueOutfit.SugerenciasElementos.Atuendo;
import QueOutfit.SugerenciasElementos.Sugerencia;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class SugerenciasTest {
    private Prenda remera;
    private Prenda camisa;
    private Prenda pantalon;
    private Prenda zapatos;
    private Prenda zapatillas;
    private Prenda gorro;
    private Prenda guantes;
    private Prenda anteojosDeSol;
    private Prenda bufanda;
    private Guardarropa guardarropa;
    private Sugerencia sugerencia;
    private Set<List<Prenda>> result;
    private Clima clima;

    @Before
    public void initialize() {
        guardarropa = new Guardarropa();
        gorro = new Prenda(new PrendaBase(ETipo.GORRO, EMaterial.LANA), ETrama.ESTAMPADA, Color.red());
        guantes = new Prenda(new PrendaBase(ETipo.GUANTES, EMaterial.CUERO), ETrama.LISA, Color.red());
        anteojosDeSol = new Prenda(new PrendaBase(ETipo.ANTEOJOS_DE_SOL, EMaterial.PLASTICO), ETrama.LISA, Color.verde());

        bufanda = new Prenda(new PrendaBase(ETipo.BUFANDA, EMaterial.LANA), ETrama.RAYADA, Color.blanco());

        remera = new Prenda(new PrendaBase(ETipo.REMERA, EMaterial.ALGODON), ETrama.LISA, Color.gris());
        camisa = new Prenda(new PrendaBase(ETipo.CAMISA, EMaterial.ALGODON), ETrama.LISA, Color.blanco());
        pantalon = new Prenda(new PrendaBase(ETipo.PANTALON, EMaterial.ACETATO), ETrama.LISA, Color.gris());
        Prenda shorts = new Prenda(new PrendaBase(ETipo.SHORT, EMaterial.PIQUE), ETrama.LISA, Color.verde());
        zapatos = new Prenda(new PrendaBase(ETipo.ZAPATOS, EMaterial.CUERO), ETrama.LISA, Color.negro());
        zapatillas = new Prenda(new PrendaBase(ETipo.ZAPATILLAS, EMaterial.CUERINA), ETrama.LISA, Color.blanco());

        guardarropa.agregarPrenda(remera);
        guardarropa.agregarPrenda(camisa);

        guardarropa.agregarPrenda(pantalon);
        guardarropa.agregarPrenda(shorts);

        guardarropa.agregarPrenda(zapatillas);

        guardarropa.agregarPrenda(bufanda);
        guardarropa.agregarPrenda(gorro);
    }

    @Test
    public void verificarCantidadDeRopaEnGuardarropa() {
        assert (7 == guardarropa.getPrendas().size());
    }

    @Test
    public void verificaCantidadCombinaciones() {
        Set<List<Prenda>> combinaciones = sugerencia.combinacionesBasicas(guardarropa);
        assert (combinaciones.size() == 8);
    }


    @Test
    public void verificoCantidadCombinacionesEnterizos() {
        Set<Atuendo> atuendos = sugerencia.obtenerTodosLosAtuendos(guardarropa);
        assert (atuendos.size() == 8);
    }
    @Test
    public void atuendosSugerencias(){
        FactoryClothes factory = new FactoryClothes();
        Atuendo atuendo = factory.getAtuendoEjemplo();
        Guardarropa guardarropa = new Guardarropa();
        atuendo.getPrendas().stream().forEach(prenda -> guardarropa.agregarPrenda(prenda));
        guardarropa.agregarPrenda(factory.getSweater());
        guardarropa.agregarPrenda(factory.getZapatosNegros());
        guardarropa.agregarPrenda(factory.getRemeraBlanca());
        guardarropa.agregarPrenda(factory.getCamisa());
        guardarropa.agregarPrenda(factory.getCamperaJean());
        Set<Atuendo> atuendos = sugerencia.(atuendo, guardarropa);
        assert(atuendos.size()==3);

    }
}