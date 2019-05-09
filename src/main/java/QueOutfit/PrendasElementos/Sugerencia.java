package QueOutfit.PrendasElementos;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sugerencia {
    Clima clima;
    public Set<Atuendo> obtenerTodosLosAtuendos(Guardarropa guardarropa){
       return combinaciones(guardarropa).stream()
               .map(listaDePrendas->new Atuendo(listaDePrendas)).collect(Collectors.toSet());
    }

     private Set<Prenda> prendasPorCategoria(Set<Prenda> prendas,Categoria categoria){
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

    public Set<List<Prenda>> combinaciones(Guardarropa guardarropa){
        Set<Prenda> prendas=guardarropa.getPrendas();
        return productoCartesianoPrendasPorCategoria(prendas);

    }

    public Set<List<Prenda>> combinacionesPorClima(Guardarropa guardarropa){
        Set<Prenda> prendas=guardarropa.getPrendas()
                .stream().filter(prenda->prenda.getTemperaturaMaxima()>=clima.getTemperatura())
                .collect(Collectors.toSet());
        return productoCartesianoPrendasPorCategoria(prendas);
    }

    public Set <Atuendo> atuendosSegunClima(Guardarropa guardarropa){
        return combinacionesPorClima(guardarropa).stream()
                .map(atuendo->new Atuendo(atuendo)).collect(Collectors.toSet());
        }

    }



