package QueOutfit.Institutos;

import QueOutfit.PrendasElementos.*;

public class InstitutoSanJuan extends Instituto{

    public InstitutoSanJuan() {
        this.prendaSuperior= new Prenda(ETipo.CHOMBA, EMaterial.PIQUE, ETrama.LISA, Color.verde());
        this.prendaInferior=new Prenda(ETipo.PANTALON,EMaterial.ACETATO,ETrama.LISA,Color.gris());
        this.prendaCalzado=new Prenda(ETipo.ZAPATILLAS,EMaterial.CUERINA,ETrama.LISA,Color.blanco());
    }


}
