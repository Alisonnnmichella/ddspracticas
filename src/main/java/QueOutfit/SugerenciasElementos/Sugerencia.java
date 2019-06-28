package QueOutfit.SugerenciasElementos;

import QueOutfit.PrendasElementos.Categoria;
import QueOutfit.PrendasElementos.Guardarropa;
import QueOutfit.PrendasElementos.Prenda;
import QueOutfit.SugerenciasElementos.Reglas.Filtro;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sugerencia {
    Filtro filtro;
    public Set<Atuendo> obtenerTodosLosAtuendos(Guardarropa guardarropa){
       return combinacionesBasicas(guardarropa).stream()
               .map(listaDePrendas->new Atuendo(listaDePrendas.stream().collect(Collectors.toSet())))
               .collect(Collectors.toSet());
    }

     public Set<Prenda> prendasPorCategoria(Set<Prenda> prendas, Categoria categoria){
        Set subconjunto= prendas.stream()
            .filter(prenda->prenda.getCategoria()==categoria)
            .collect(Collectors.toSet());
        return subconjunto;
    }

    private Set<List<Prenda>> productoCartesianoPrendasPorCategoria(Set<Prenda> prendas){
        return Sets.cartesianProduct(ImmutableList.of(
                prendasPorCategoria(prendas,Categoria.SUPERIOR),
                prendasPorCategoria(prendas,Categoria.INFERIOR),
                prendasPorCategoria(prendas,Categoria.CALZADO),
                prendasPorCategoria(prendas,Categoria.ACCESORIO)
        ));
    }


    public Set <List<Prenda>> combinacionesBasicas(Guardarropa guardarropa){
       Set<Prenda>prendasBase= guardarropa.getPrendas()
                .stream().filter(prenda->!this.accesorioQueAbriga(prenda))
                .collect(Collectors.toSet());
        return productoCartesianoPrendasPorCategoria(prendasBase);
    }

    private boolean accesorioQueAbriga(Prenda prenda){
        return (prenda.getCategoria()==Categoria.ACCESORIO &&
                (prenda.getTipo().getNivelAbrigo().getPuntos()>0));
    }

    public Set<Prenda>listaDePrendas(Prenda prenda,Set<Prenda>prendas){
        Set<Prenda>prendasmasuno=prendas;
        prendasmasuno.add(prenda);
        return prendasmasuno;
    }

    public Set<Atuendo> superposicionParaUnAtuendo(Atuendo atuendo,Set<Prenda> prendas) {
        return  prendas.stream()
                .filter(prenda -> filtro.match(listaDePrendas(prenda,atuendo.getPrendas())))
                .map(prenda->new Atuendo(listaDePrendas(prenda,atuendo.getPrendas())))
                .collect(Collectors.toSet());
    }

    }



