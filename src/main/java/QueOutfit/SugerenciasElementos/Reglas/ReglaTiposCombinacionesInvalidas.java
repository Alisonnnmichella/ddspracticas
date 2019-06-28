package QueOutfit.SugerenciasElementos.Reglas;

import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.Prenda;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReglaTiposCombinacionesInvalidas extends Regla {
    Set<ETipo>tiposCombinacionInvalida;
    public ReglaTiposCombinacionesInvalidas(Set<ETipo> tiposCombinacionInvalida){
        this.tiposCombinacionInvalida=tiposCombinacionInvalida;
    }
    @Override
    protected boolean tieneSentido(Set<Prenda> conjunto) {
    Set<ETipo> tipos=conjunto.stream().map(prenda -> prenda.getTipo())
            .collect(Collectors.toSet());
    return !tipos.containsAll(tiposCombinacionInvalida);
    }
}
