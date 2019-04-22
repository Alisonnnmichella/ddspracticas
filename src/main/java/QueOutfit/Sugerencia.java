package QueOutfit;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
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

    Set<Prenda> superiores= ImmutableSet.copyOf(prendas.stream()
            .filter(prenda->prenda.getCategoria()==Categoria.SUPERIOR)
            .collect(Collectors.toSet()));
    System.out.println("Prendas superiores");
        for(Prenda p:superiores)
            System.out.println(" "+p.getNombre()+" ");


        Set<Prenda> inferiores=ImmutableSet.copyOf(prendas.stream()
            .filter(prenda->prenda.getCategoria()==Categoria.INFERIOR)
            .collect(Collectors.toSet()));
        System.out.println("\n Prendas inferiores");
        for(Prenda p:inferiores)
            System.out.println(" "+p.getNombre()+" ");


        Set<Prenda> calzados=ImmutableSet.copyOf(prendas.stream()
            .filter(prenda->prenda.getCategoria()==Categoria.CALZADO)
            .collect(Collectors.toSet()));
        System.out.println("\n Prendas calzados");
        for(Prenda p:calzados)
            System.out.println(" "+p.getNombre()+" ");


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





}