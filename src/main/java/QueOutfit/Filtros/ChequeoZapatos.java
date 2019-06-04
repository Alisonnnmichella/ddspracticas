package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoZapatos implements Chequeo {
    public boolean match(PrendaBase base){
        return (base.getTipo()== ETipo.ZAPATOS||base.getTipo()==ETipo.ZAPATILLAS ) &&
                (base.getMaterial()== EMaterial.CUERO ||base.getMaterial()==EMaterial.CUERINA);
    }

}
