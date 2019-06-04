package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoGuantes implements Chequeo{

    public boolean match(PrendaBase base) {
        return (base.getTipo()== ETipo.GUANTES
                &&base.getMaterial()!=EMaterial.JEAN);
    }

}
