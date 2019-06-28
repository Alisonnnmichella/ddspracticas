package QueOutfit.SugerenciasElementos.Reglas;

import QueOutfit.PrendasElementos.Categoria;
import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.Prenda;

import java.util.Set;
import java.util.stream.Collectors;

public class ReglaCombinacionInferior extends Regla {

    @Override
    protected boolean tieneSentido(Set<Prenda> conjunto) {
        Set<Prenda> prendasInferiores=conjunto.stream().filter(prenda -> prenda.getCategoria()== Categoria.INFERIOR)
                .collect(Collectors.toSet());
        if(prendasInferiores.size()>2)
            return  false;
        return
                prendasInferiores.stream()
                .map(prenda ->prenda.getTipo()).collect(Collectors.toSet())
                .contains(ETipo.CALZATERMICA);

    }
}
