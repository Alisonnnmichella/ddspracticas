package QueOutfit.PrendasElementos;

import QueOutfit.Excepciones.AtuendoException;
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
        if (!(atuendo.size() == 4)) {
            throw new AtuendoException("El atuendo no contiene exactamente 4 prendas");
        }
        if (!contieneTodasLasCategorias()){
            throw new AtuendoException("Las prendas del atuendo no contienen todas una categoría diferente");
        }
    }

    private boolean contieneTodasLasCategorias(){
        return atuendo.stream().map(prenda->prenda.getCategoria()).collect(Collectors.toSet()).
                containsAll((Arrays.asList(Categoria.values())));
    }

    public Prenda obtenerPrenda(Categoria categoria) {
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

}