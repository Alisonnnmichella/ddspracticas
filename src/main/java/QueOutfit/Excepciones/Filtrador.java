package QueOutfit.Excepciones;

import QueOutfit.PrendasElementos.BorradorPrenda;
import QueOutfit.PrendasElementos.PrendaBase;

import java.util.ArrayList;

public class Filtrador {
    private ArrayList<Chequeo> filtro;
    public Filtrador(){
        filtro=new ArrayList<>();
        filtro.add(new ChequeoPantalon());
        filtro.add(new ChequeoRemera());
    }

    public boolean pasaFiltro(PrendaBase base){
        return filtro.stream().anyMatch(chequeo->chequeo.match(base));
    }
}
