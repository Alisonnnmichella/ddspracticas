package QueOutfit.SugerenciasElementos.Reglas;

import QueOutfit.PrendasElementos.Prenda;

import java.util.Set;
import java.util.stream.Collectors;

public class ReglaTiposRepetidos extends Regla {
    @Override
    protected boolean tieneSentido(Set<Prenda> conjunto) {
      return
            conjunto.stream().map(prenda->prenda.getTipo()).collect(Collectors.toSet()).size()
                ==conjunto.size();
    }
}
