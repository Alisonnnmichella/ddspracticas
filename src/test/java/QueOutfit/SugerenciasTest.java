package QueOutfit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.containsInAnyOrder;

public class SugerenciasTest {
    Prenda remera;
    Prenda camisa;
    Prenda pantalon;
    Prenda shorts;
    Prenda  zapatos;
    Prenda zapatillas;
    Guardarropa guardarropa= new Guardarropa();
    ArrayList <Prenda> comb1;
    ArrayList <Prenda> comb2;
    ArrayList <Prenda> comb3;
    ArrayList <Prenda> comb4;
    ArrayList <Prenda> comb5;
    ArrayList <Prenda> comb6;
    ArrayList <Prenda> comb7;
    ArrayList <Prenda> comb8;
    Sugerencia sugerencia;
    Set<List<Prenda>> result;
    AtuendoEnterizo at1;
    AtuendoEnterizo at2;
    AtuendoEnterizo at3;
    AtuendoEnterizo at4;
    AtuendoEnterizo at5;
    AtuendoEnterizo at6;
    AtuendoEnterizo at7;
    AtuendoEnterizo at8;








    @Before
    public void initialize(){
        remera= new Prenda(ETipo.REMERA,EMaterial.ALGODON,ETrama.LISA,Color.gris());
        camisa = new Prenda(ETipo.CAMISA,EMaterial.ALGODON,ETrama.LISA,Color.blanco());
        pantalon= new Prenda(ETipo.PANTALON,EMaterial.ACETATO,ETrama.LISA,Color.gris());
        shorts = new Prenda(ETipo.SHORT,EMaterial.PIQUE,ETrama.LISA,Color.verde());
        zapatos =new Prenda(ETipo.ZAPATOS,EMaterial.CUERO,ETrama.LISA,Color.negro());
        zapatillas=new Prenda(ETipo.ZAPATILLAS,EMaterial.CUERINA,ETrama.LISA,Color.blanco());
        guardarropa.agregarPrenda(remera);
        guardarropa.agregarPrenda(camisa);
        guardarropa.agregarPrenda(pantalon);
        guardarropa.agregarPrenda(shorts);
        guardarropa.agregarPrenda(zapatillas);
        guardarropa.agregarPrenda(zapatos);
        sugerencia= new Sugerencia();

        comb1=new ArrayList<Prenda>();
        comb2=new ArrayList<Prenda>();
        comb3=new ArrayList<Prenda>();
        comb4=new ArrayList<Prenda>();
        comb5=new ArrayList<Prenda>();
        comb6=new ArrayList<Prenda>();
        comb7=new ArrayList<Prenda>();
        comb8=new ArrayList<Prenda>();

        comb1.add(remera);
        comb1.add(pantalon);
        comb1.add(zapatos);
        at1= new AtuendoEnterizo(remera,pantalon,zapatos);

        comb2.add(remera);
        comb2.add(pantalon);
        comb2.add(zapatillas);
        at2= new AtuendoEnterizo(remera,pantalon,zapatillas);

        comb3.add(remera);
        comb3.add(shorts);
        comb3.add(zapatos);
        at3= new AtuendoEnterizo(remera,shorts,zapatos);

        comb4.add(remera);
        comb4.add(shorts);
        comb4.add(zapatillas);
        at4= new AtuendoEnterizo(remera,shorts,zapatillas);

        comb5.add(camisa);
        comb5.add(pantalon);
        comb5.add(zapatos);
        at5= new AtuendoEnterizo(camisa,pantalon,zapatos);

        comb6.add(camisa);
        comb6.add(pantalon);
        comb6.add(zapatillas);
        at6=new AtuendoEnterizo(camisa,pantalon,zapatillas);

        comb7.add(camisa);
        comb7.add(shorts);
        comb7.add(zapatos);
        at7= new AtuendoEnterizo(camisa,shorts,zapatos);

        comb8.add(camisa);
        comb8.add(shorts);
        comb8.add(zapatillas);
        at8= new AtuendoEnterizo(camisa,shorts,zapatillas);

    }

    @Test
    public void verificaCantidadCombinaciones() {
        Set<List<Prenda>> combinaciones=sugerencia.combinaciones(guardarropa);
        assert (combinaciones.size()==8);
    }
    @Test
    public void contieneTodasLasCombinacionesCorrectamente(){
        result= sugerencia.combinaciones(guardarropa);
        assertThat(result,containsInAnyOrder(comb1,comb2,comb3,comb4,comb5,comb6,comb7,comb8));
    }

    @Test
    public void verificoCantidadCombinacionesEnterizos(){
        ArrayList <AtuendoEnterizo> atuendos= sugerencia.combinacionesAtuendosEnterizos(guardarropa);
        assert(atuendos.size()==8);
    }


}
