package QueOutfit.Excepciones;

import QueOutfit.PrendasElementos.BorradorPrenda;
import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.PrendaBase;

public class ChequeoPantalon implements Chequeo{

    public boolean match(PrendaBase base) {
        return base.getTipo()== ETipo.PANTALON && (base.getMaterial()== EMaterial.JEAN
                ||base.getMaterial()==EMaterial.LANA);
    }

}
