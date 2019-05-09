package QueOutfit.Institutos;

import QueOutfit.PrendasElementos.Prenda;

public abstract class Instituto {
   protected Prenda prendaSuperior;
   protected Prenda prendaInferior;
   protected Prenda prendaCalzado;


    public Uniforme getUniforme(){
        return new Uniforme(prendaSuperior,prendaInferior,prendaCalzado);
    }
}
