package QueOutfit.Institutos;

import QueOutfit.PrendasElementos.*;

public class InstitutoSanJuan extends Instituto{

    public InstitutoSanJuan() {
        this.prendaSuperior= new Prenda(new PrendaBase(ETipo.CHOMBA, EMaterial.PIQUE,40), ETrama.LISA, Color.verde());
        this.prendaInferior=new Prenda(new PrendaBase(ETipo.PANTALON,EMaterial.ACETATO,40),ETrama.LISA,Color.gris());
        this.prendaCalzado=new Prenda(new PrendaBase(ETipo.ZAPATILLAS,EMaterial.CUERINA,40),ETrama.LISA,Color.blanco());
    }


}
