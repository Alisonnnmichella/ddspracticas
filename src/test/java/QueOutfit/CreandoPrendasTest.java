package QueOutfit;

import QueOutfit.PrendasElementos.*;
import org.junit.Test;

public class CreandoPrendasTest {
    private BuilderPrenda remeraBorrador= new BuilderPrenda(ETipo.REMERA);

    @Test(expected = RuntimeException.class)
    public void noSePuedeCrearUnaPrendaEnBorradorConConstructorNull(){
        remeraBorrador.contruirPrenda();
    }


    @Test(expected = RuntimeException.class)
        public void noSePuedeCrearUnaRemeraDeCuero(){
        remeraBorrador.setMaterial(EMaterial.CUERO);
        remeraBorrador.setColorPrincipal(Color.red());
        remeraBorrador.contruirPrenda();
    }
    @Test
    public void sePuedeCrearUnaRemeraDeAlgodon(){
        remeraBorrador.setColorPrincipal(Color.red());
        remeraBorrador.setMaterial(EMaterial.ALGODON);
        Prenda remera=remeraBorrador.contruirPrenda();

    }
}
