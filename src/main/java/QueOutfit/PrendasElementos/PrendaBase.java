package QueOutfit.PrendasElementos;

import QueOutfit.Excepciones.Filtrador;

public class PrendaBase {
    private ETipo tipo;
    private EMaterial material;
    private int temperaturaMaxima;
    private Filtrador filtrador;
    public PrendaBase(ETipo tipo, EMaterial material,int temperaturaMaxima){
        this.tipo=tipo;
        this.material=material;
        this.temperaturaMaxima=temperaturaMaxima;
        filtrador=new Filtrador();
    }
    public ETipo getTipo(){
        return tipo;
    }
    public Categoria getCategoria(){return tipo.getCategoria();}
    public EMaterial getMaterial(){return material;}
    public String getNombre(){
        return getCategoria().name();
    }
    public int getTemperaturaMaxima(){return temperaturaMaxima;}
}
