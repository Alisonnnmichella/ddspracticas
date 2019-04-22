package QueOutfit;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import com.google.common.collect.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
