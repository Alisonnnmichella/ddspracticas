package QueOutfit;

import QueOutfit.PrendasElementos.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


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
    private ArrayList<Prenda> comb1;
    private ArrayList<Prenda> comb2;
    private ArrayList<Prenda> comb3;
    private ArrayList<Prenda> comb4;
    private ArrayList<Prenda> comb5;
    private ArrayList<Prenda> comb6;
    private ArrayList<Prenda> comb7;
    private ArrayList<Prenda> comb8;
    private Sugerencia sugerencia;
    private Set<List<Prenda>> result;
    private Atuendo at1;
    private Atuendo at2;
    private Atuendo at3;
    private Atuendo at4;
    private Atuendo at5;
    private Atuendo at6;
    private Atuendo at7;
    private Atuendo at8;
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

        comb1 = new ArrayList<>();
        comb2 = new ArrayList<>();
        comb3 = new ArrayList<>();
        comb4 = new ArrayList<>();
        comb5 = new ArrayList<>();
        comb6 = new ArrayList<>();
        comb7 = new ArrayList<>();
        comb8 = new ArrayList<>();

        comb1.add(remera);
        comb1.add(pantalon);
        comb1.add(zapatillas);
        comb1.add(bufanda);
        at1 = new Atuendo(comb1);

        comb2.add(remera);
        comb2.add(pantalon);
        comb2.add(zapatillas);
        comb2.add(gorro);

        at2 = new Atuendo(comb2);

        comb3.add(remera);
        comb3.add(shorts);
        comb3.add(zapatillas);
        comb3.add(bufanda);
        at3 = new Atuendo(comb3);

        comb4.add(remera);
        comb4.add(shorts);
        comb4.add(zapatillas);
        comb4.add(gorro);
        at4 = new Atuendo(comb4);

        comb5.add(camisa);
        comb5.add(pantalon);
        comb5.add(zapatos);
        comb5.add(bufanda);
        at5 = new Atuendo(comb5);

        comb6.add(camisa);
        comb6.add(pantalon);
        comb6.add(zapatillas);
        comb6.add(gorro);
        at6 = new Atuendo(comb6);

        comb7.add(camisa);
        comb7.add(shorts);
        comb7.add(zapatos);
        comb7.add(bufanda);
        at7 = new Atuendo(comb7);

        comb8.add(camisa);
        comb8.add(shorts);
        comb8.add(zapatillas);
        comb8.add(gorro);
        at8 = new Atuendo(comb8);
        sugerencia= new Sugerencia();
    }

    @Test
    public void verificarCantidadDeRopaEnGuardarropa() {
        assert (7 == guardarropa.getPrendas().size());
    }

    @Test
    public void verificaCantidadCombinaciones() {
        Set<List<Prenda>> combinaciones = sugerencia.combinaciones(guardarropa);
        assert (combinaciones.size() == 8);
    }


    @Test
    public void verificoCantidadCombinacionesEnterizos() {
        Set<Atuendo> atuendos = sugerencia.obtenerTodosLosAtuendos(guardarropa);
        assert (atuendos.size() == 8);
    }
    @Test
    public void verificoCantidadDeSugerencias() {
        FactoryClothes factory = new FactoryClothes();
        Atuendo atuendo = factory.getAtuendoEjemplo();
        Guardarropa guardarropa = new Guardarropa();
        atuendo.getPrendas().stream().forEach(prenda -> guardarropa.agregarPrenda(prenda));
        guardarropa.agregarPrenda(factory.getSweater());
        guardarropa.agregarPrenda(factory.getZapatosNegros());
        guardarropa.agregarPrenda(factory.getRemeraBlanca());
        guardarropa.agregarPrenda(factory.getCamisa());
        guardarropa.agregarPrenda(factory.getCamperaJean());

        Set<Atuendo> atuendos = sugerencia.combinacionesSuperioresParaUnAtuendo(atuendo, guardarropa);
        for (Atuendo a : atuendos) {
            a.getPrendas().forEach(prenda -> System.out.println(prenda.getTipo()));
            System.out.println("\n");
        }


    }
}