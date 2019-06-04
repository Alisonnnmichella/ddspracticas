package QueOutfit.Filtros;

import QueOutfit.PrendasElementos.PrendaBase;

import java.util.ArrayList;

public class Filtrador {
    private ArrayList<Chequeo> filtro;
    public Filtrador(){
        filtro=new ArrayList<>();
        filtro.add(new ChequeoPantalonYShort());
        filtro.add(new ChequeoRemeraYCamisa());
        filtro.add(new ChequeoSweaterBufandaGorro());
        filtro.add(new ChequeoZapatos());
        filtro.add(new ChequeoAnteojosDeSol());
        filtro.add(new ChequeoCampera());
        filtro.add(new ChequeoGuantes());
    }

    public boolean pasaFiltro(PrendaBase base){
        return filtro.stream().anyMatch(chequeo->chequeo.match(base));
    }
}
