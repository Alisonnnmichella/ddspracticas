package QueOutfit.Excepciones;

import QueOutfit.PrendasElementos.BorradorPrenda;
import QueOutfit.PrendasElementos.EMaterial;
import QueOutfit.PrendasElementos.ETipo;

public class ChequeoPantalon implements Chequeo{

    public boolean match(BorradorPrenda borrador) {
        return borrador.getTipo()== ETipo.PANTALON && (borrador.getMaterial()== EMaterial.JEAN
                ||borrador.getMaterial()==EMaterial.LANA);
    }

}
