package QueOutfit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
        result=sugerencia.combinaciones(guardarropa);

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

        comb2.add(remera);
        comb2.add(pantalon);
        comb2.add(zapatillas);

        comb3.add(remera);
        comb3.add(shorts);
        comb3.add(zapatos);

        comb4.add(remera);
        comb4.add(shorts);
        comb4.add(zapatillas);

        comb5.add(camisa);
        comb5.add(pantalon);
        comb5.add(zapatos);

        comb6.add(camisa);
        comb6.add(pantalon);
        comb6.add(zapatillas);

        comb7.add(camisa);
        comb7.add(shorts);
        comb7.add(zapatos);

        comb8.add(camisa);
        comb8.add(shorts);
        comb8.add(zapatillas);


    }
    @Test
    public void size() {
        this.initialize();
        Set<List<Prenda>> combinaciones=sugerencia.combinaciones(guardarropa);
        System.out.println("Combinaciones: "+combinaciones.size());
        assert (combinaciones.size()>0);

    }

}
