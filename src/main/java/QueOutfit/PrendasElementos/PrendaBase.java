package QueOutfit.PrendasElementos;

import QueOutfit.Excepciones.PrendaBaseException;
import QueOutfit.Filtros.Filtrador;

public class PrendaBase {
    private ETipo tipo;
    private EMaterial material;
    public PrendaBase(ETipo tipo, EMaterial material){
        this.tipo=tipo;
        this.material=material;
       validacion();
    }
    public void validacion(){
        Filtrador filtrador=new Filtrador();
        if(!filtrador.pasaFiltro(this))
            throw new PrendaBaseException();
    }
    public ETipo getTipo(){
        return tipo;
    }
    public Categoria getCategoria(){return tipo.getCategoria();}
    public EMaterial getMaterial(){return material;}
    public String getNombre(){
        return getCategoria().name();
    }
}
