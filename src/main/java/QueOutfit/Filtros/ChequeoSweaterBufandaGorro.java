package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoSweaterBufandaGorro implements Chequeo {
    public boolean match(PrendaBase base){
        return (base.getTipo()== ETipo.SWEATER|| base.getTipo()==ETipo.BUFANDA||base.getTipo()==ETipo.GORRO) &&
                (base.getMaterial()== EMaterial.LANA);
    }

}
