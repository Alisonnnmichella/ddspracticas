package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoRemeraYCamisa implements Chequeo {
    public boolean match(PrendaBase base){
       return (base.getTipo()== ETipo.REMERA  || base.getTipo()==ETipo.CAMISA)&& (base.getMaterial()!= EMaterial.CUERINA && base.getMaterial()!=EMaterial.CUERO);
    }

}
