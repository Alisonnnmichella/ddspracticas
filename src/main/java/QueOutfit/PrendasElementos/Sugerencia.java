package QueOutfit.PrendasElementos;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sugerencia {

    public Set<Atuendo> obtenerTodosLosAtuendos(Guardarropa guardarropa){
       return combinaciones(guardarropa).stream()
               .map(listaDePrendas->new Atuendo(listaDePrendas)).collect(Collectors.toSet());
    }

     public Set<Prenda> prendasPorCategoria(Set<Prenda> prendas,Categoria categoria){
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
    public List<Prenda>listaDePrendas(Prenda prenda,List<Prenda>prendas){
        List<Prenda>prendasmasuno=prendas;
        prendasmasuno.add(prenda);
        return prendasmasuno;
    }
    public Set<Atuendo> combinacionesSuperioresParaUnAtuendo(Atuendo atuendo,Guardarropa guardarropa) {
        Set<Prenda> prendas = this.prendasPorCategoria(guardarropa.getPrendas(), Categoria.SUPERIOR);
        return  prendas.stream()
                .filter(prenda -> atuendo.puedeAgregarPrenda(prenda))
                .map(prenda->new Atuendo(listaDePrendas(prenda,atuendo.getPrendas())))
                .collect(Collectors.toSet());
    }


    }





