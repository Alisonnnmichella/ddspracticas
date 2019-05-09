package QueOutfit.Excepciones;

import QueOutfit.PrendasElementos.BorradorPrenda;

import java.util.ArrayList;

public class Filtrador {
    private ArrayList<Chequeo> filtro;
    public Filtrador(){
        filtro=new ArrayList<>();
        filtro.add(new ChequeoPantalon());
        filtro.add(new ChequeoRemera());
    }
    public boolean pasaFiltro(BorradorPrenda borradorPrenda){
        return filtro.stream().anyMatch(chequeo->chequeo.match(borradorPrenda));
    }
}
