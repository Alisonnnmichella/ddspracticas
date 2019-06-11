package QueOutfit.SugerenciasElementos;

import QueOutfit.Excepciones.AtuendoException;
import QueOutfit.Excepciones.PrendaAcopladaException;
import QueOutfit.PrendasElementos.Categoria;
import QueOutfit.PrendasElementos.Prenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Atuendo {

    private List <Prenda> atuendo;
    public Atuendo(List <Prenda> atuendo) {
        this.atuendo=atuendo;
        validarAtuendo();
    }

    public void validarAtuendo() {
        if (!contieneTodasLasCategorias()){
            throw new AtuendoException("Las prendas del atuendo no contienen todas una categoría diferente");
        }
    }

    private boolean contieneTodasLasCategorias(){
        return atuendo.stream().map(prenda->prenda.getCategoria()).collect(Collectors.toSet()).
                containsAll((Arrays.asList(Categoria.values())));
    }

    private Prenda obtenerPrenda(Categoria categoria) {
        return atuendo.stream().filter(prenda->prenda.getCategoria()==categoria).collect(Collectors.toList()).get(0);
    }

    public Prenda getInferior() {
        return this.obtenerPrenda(Categoria.INFERIOR);
    }

    public Prenda getCalzado() {
        return this.obtenerPrenda(Categoria.CALZADO);
    }

    public Prenda getAccesorios() {
        return this.obtenerPrenda(Categoria.ACCESORIO);
    }

    public Prenda getSuperior() {
        return this.obtenerPrenda(Categoria.SUPERIOR);
    }

    public List <Prenda> getPrendas(){
        List <Prenda> prendas= new ArrayList<>();
        atuendo.forEach(prenda->prendas.add(prenda));
        return prendas;

    }

    public boolean compatibleConPrenda(Prenda prendanueva){
        return  !atuendo.stream().map(prenda->prenda.getTipo()).collect(Collectors.toSet())
               .contains(prendanueva.getTipo());

    }
}