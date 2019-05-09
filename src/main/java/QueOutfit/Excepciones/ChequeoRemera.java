package QueOutfit.Excepciones;

import QueOutfit.PrendasElementos.BorradorPrenda;
import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;

public class ChequeoRemera implements Chequeo {
    public boolean match(BorradorPrenda borrador){
       return borrador.getTipo()== ETipo.REMERA && (borrador.getMaterial()!= EMaterial.CUERINA && borrador.getMaterial()!=EMaterial.CUERO);
    }

}
