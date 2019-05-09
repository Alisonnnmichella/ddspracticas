package QueOutfit.Institutos;

import QueOutfit.PrendasElementos.*;

public class InstitutoJohn extends Instituto {
    public InstitutoJohn() {
        this.prendaSuperior= new Prenda(new PrendaBase(ETipo.CAMISA, EMaterial.ALGODON,40), ETrama.LISA, Color.blanco());
        this.prendaInferior=new Prenda(new PrendaBase(ETipo.PANTALON_DE_VESTIR,EMaterial.ACETATO,40),ETrama.LISA,Color.negro());
        this.prendaCalzado=new Prenda(new PrendaBase(ETipo.ZAPATOS,EMaterial.CUERO,20),ETrama.LISA,Color.negro());
    }
}
