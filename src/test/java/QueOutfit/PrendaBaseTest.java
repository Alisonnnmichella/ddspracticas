package QueOutfit;

import QueOutfit.Excepciones.PrendaBaseException;
import QueOutfit.PrendasElementos.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PrendaBaseTest {

    @Test(expected = PrendaBaseException.class)
    public void noSePuedeCrearUnaRemeraDeCuero(){
        PrendaBase prendaBase= new PrendaBase(ETipo.REMERA, EMaterial.CUERO);
    }
    @Test
    public void sePuedeCrearUnaRemeraDeAlgodon(){
        PrendaBase prendaBase= new PrendaBase(ETipo.REMERA, EMaterial.ALGODON);
    }
    @Test(expected= PrendaBaseException.class)
    public void noSePuedeCrearUnSweaterQueNoSeaDeLana(){
        PrendaBase prendaBase= new PrendaBase(ETipo.SWEATER,EMaterial.JEAN);
    }
    @Test
    public void creacion(){
         Prenda remera;
         Prenda camisa;
         Prenda pantalon;
         Prenda zapatos;
         Prenda zapatillas;
         Prenda gorro;
         Prenda guantes;
         Prenda anteojosDeSol;
         Prenda bufanda;

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


        }
}
