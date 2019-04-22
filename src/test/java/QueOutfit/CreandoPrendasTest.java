package QueOutfit;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.*;
import org.junit.Before;
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
    @Test
    public void whenCalculatingCartesianProductOfSets_thenCorrect() {
        Prenda remera= new Prenda(ETipo.REMERA,EMaterial.ALGODON,ETrama.LISA,Color.gris());
        Prenda camisa = new Prenda(ETipo.CAMISA,EMaterial.ALGODON,ETrama.LISA,Color.blanco());

        Prenda pantalon= new Prenda(ETipo.PANTALON,EMaterial.ACETATO,ETrama.LISA,Color.gris());
        Prenda shorts = new Prenda(ETipo.SHORT,EMaterial.PIQUE,ETrama.LISA,Color.verde());

        Prenda  zapatos =new Prenda(ETipo.ZAPATOS,EMaterial.CUERO,ETrama.LISA,Color.negro());
        Prenda zapatillas=new Prenda(ETipo.ZAPATILLAS,EMaterial.CUERINA,ETrama.LISA,Color.blanco());


        Set<Prenda> superiores=ImmutableSet.of(remera,camisa);
        Set<Prenda> inferiores= ImmutableSet.of(pantalon,shorts);
        Set<Prenda> calzados=ImmutableSet.of(zapatos);
        Set<List<Prenda>> result=
                Sets.cartesianProduct(ImmutableList.of(superiores, inferiores,calzados));


        ArrayList <Prenda> comb1=new ArrayList<Prenda>();
        ArrayList <Prenda> comb2=new ArrayList<Prenda>();
        ArrayList <Prenda> comb3=new ArrayList<Prenda>();
        ArrayList <Prenda> comb4=new ArrayList<Prenda>();

        comb1.add(remera);
        comb1.add(pantalon);
        comb1.add(zapatos);

        comb3.add(remera);
        comb3.add(shorts);
        comb3.add(zapatos);

        comb2.add(camisa);
        comb2.add(pantalon);
        comb2.add(zapatos);

        comb4.add(camisa);
        comb4.add(shorts);
        comb4.add(zapatos);

        //assertThat(result,containsInAnyOrder(comb1,comb2,comb3,comb4));
        assert(result.contains(comb1));
    }

}
