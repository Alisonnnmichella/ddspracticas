package QueOutfit;

import org.junit.Before;
import org.junit.Test;

public class CreandoPrendasTest {
    private BorradorPrenda remeraBorrador= new BorradorPrenda(ETipo.REMERA);

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
