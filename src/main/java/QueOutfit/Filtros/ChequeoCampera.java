package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoCampera implements Chequeo{
     public boolean match(PrendaBase base) {
        return base.getTipo()== ETipo.CAMPERA && (base.getMaterial()== EMaterial.JEAN
                ||base.getMaterial()==EMaterial.LANA);
    }

}
