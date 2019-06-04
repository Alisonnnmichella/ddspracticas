package QueOutfit.Institutos;

import QueOutfit.PrendasElementos.*;

public class InstitutoJohn extends Instituto {
    public InstitutoJohn() {
        this.prendaSuperior= new Prenda(new PrendaBase(ETipo.CAMISA, EMaterial.ALGODON), ETrama.LISA, Color.blanco());
        this.prendaInferior=new Prenda(new PrendaBase(ETipo.PANTALON_DE_VESTIR,EMaterial.ACETATO),ETrama.LISA,Color.negro());
        this.prendaCalzado=new Prenda(new PrendaBase(ETipo.ZAPATOS,EMaterial.CUERO),ETrama.LISA,Color.negro());
    }
}
