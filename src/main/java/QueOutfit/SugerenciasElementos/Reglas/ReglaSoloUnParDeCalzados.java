package QueOutfit.SugerenciasElementos.Reglas;

import QueOutfit.PrendasElementos.Categoria;
import QueOutfit.PrendasElementos.Prenda;

import java.util.Set;
import java.util.stream.Collectors;

public class ReglaSoloUnParDeCalzados extends Regla {

    @Override
    protected boolean tieneSentido(Set<Prenda> conjunto) {
        return conjunto.stream().filter(prenda -> prenda.getCategoria()== Categoria.CALZADO)
                .collect(Collectors.toSet()).size()==1;
    }
}
