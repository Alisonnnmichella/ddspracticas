package QueOutfit;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sugerencia {
    public Sugerencia(){
    }
    public Set<List<Prenda>> combinaciones(Guardarropa guardarropa){
    HashSet<Prenda> prendas=guardarropa.getPrendas();

        Set<Prenda> superiores= obtenerPrendasDeCategoria(guardarropa,Categoria.SUPERIOR);
        Set<Prenda> inferiores=obtenerPrendasDeCategoria(guardarropa,Categoria.INFERIOR);
        Set<Prenda> calzados=obtenerPrendasDeCategoria(guardarropa,Categoria.CALZADO);
        Set<List<Prenda>> result=
            Sets.cartesianProduct(ImmutableList.of(superiores, inferiores,calzados));
        return result;
    }

    public ArrayList<AtuendoEnterizo> combinacionesAtuendosEnterizos(Guardarropa guardarropa){
        ArrayList <AtuendoEnterizo> atuendos=new ArrayList<>();
        Set<List<Prenda>> result=this.combinaciones(guardarropa);
           result.forEach(li->atuendos.add(new AtuendoEnterizo(li.get(0),li.get(1),li.get(2))));
           return atuendos;
    }

    public Set<Prenda> obtenerPrendasDeCategoria(Guardarropa guardarropa,Categoria categoria){
        HashSet<Prenda> prendas=guardarropa.getPrendas();
           Set subconjunto= prendas.stream()
            .filter(prenda->prenda.getCategoria()==categoria)
            .collect(Collectors.toSet());
        return subconjunto;
    }


}
