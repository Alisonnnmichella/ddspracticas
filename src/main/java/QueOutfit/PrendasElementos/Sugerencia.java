package QueOutfit.PrendasElementos;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sugerencia {

    public Set<Atuendo> obtenerAtuendos(Guardarropa guardarropa){
       return combinaciones(guardarropa).stream()
               .map(listaDePrendas->new Atuendo(listaDePrendas)).collect(Collectors.toSet());
    }

     private Set<Prenda> obtenerPrendasDeCategoria(Guardarropa guardarropa,Categoria categoria){
        HashSet<Prenda> prendas=guardarropa.getPrendas();
           Set subconjunto= prendas.stream()
            .filter(prenda->prenda.getCategoria()==categoria)
            .collect(Collectors.toSet());
        return subconjunto;
    }

    public Set<List<Prenda>> combinaciones(Guardarropa guardarropa){
        Set<Prenda> superiores= obtenerPrendasDeCategoria(guardarropa,Categoria.SUPERIOR);
        Set<Prenda> inferiores=obtenerPrendasDeCategoria(guardarropa,Categoria.INFERIOR);
        Set<Prenda> calzados=obtenerPrendasDeCategoria(guardarropa,Categoria.CALZADO);
        Set<Prenda> accesorios=obtenerPrendasDeCategoria(guardarropa,Categoria.ACCESORIO);
        return Sets.cartesianProduct(ImmutableList.of(superiores, inferiores,calzados,accesorios));
    }

}

