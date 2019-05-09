package QueOutfit.Excepciones;

import QueOutfit.PrendasElementos.BorradorPrenda;
import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoRemera implements Chequeo {
    public boolean match(PrendaBase base){
       return base.getTipo()== ETipo.REMERA && (base.getMaterial()!= EMaterial.CUERINA && base.getMaterial()!=EMaterial.CUERO);
    }

}
