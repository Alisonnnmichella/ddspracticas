package QueOutfit.SugerenciasElementos.Reglas;

import QueOutfit.PrendasElementos.Prenda;

import java.util.Set;

public abstract class Regla {
    Filtro filtro;
    public Regla(){
        filtro.agregarRegla(this);
    }
    protected abstract boolean tieneSentido(Set<Prenda> conjunto);
}
