package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoPantalonYShort implements Chequeo{

    public boolean match(PrendaBase base) {
        return (base.getTipo()== ETipo.PANTALON||base.getTipo()==ETipo.SHORT )&& (base.getMaterial()!=EMaterial.LANA);
    }

}
