package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoAnteojosDeSol implements Chequeo{

    public boolean match(PrendaBase base) {
        return base.getTipo()== ETipo.ANTEOJOS_DE_SOL && (base.getMaterial()== EMaterial.PLASTICO);
    }

}
