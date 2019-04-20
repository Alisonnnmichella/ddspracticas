package QueOutfit;

public class ChequeoPantalon implements Chequeo{

    public boolean match(BorradorPrenda borrador) {
        return borrador.getTipo()==ETipo.PANTALON && (borrador.getMaterial()==EMaterial.JEAN
                ||borrador.getMaterial()==EMaterial.LANA);
    }

}
