package QueOutfit.Institutos;

import QueOutfit.PrendasElementos.*;

public class InstitutoJohn extends Instituto {
    public InstitutoJohn() {
        this.prendaSuperior= new Prenda(ETipo.CAMISA, EMaterial.ALGODON, ETrama.LISA, Color.blanco());
        this.prendaInferior=new Prenda(ETipo.PANTALON_DE_VESTIR,EMaterial.ACETATO,ETrama.LISA,Color.negro());
        this.prendaCalzado=new Prenda(ETipo.ZAPATOS,EMaterial.CUERO,ETrama.LISA,Color.negro());
    }
}
