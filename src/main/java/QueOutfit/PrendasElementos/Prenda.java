package QueOutfit.PrendasElementos;

public class Prenda {
    private PrendaBase base;
    private ETrama trama;
    private Color colorPrimario;
    private Color colorSecundario;
    private int TemperaturaMaxima;

    public Prenda(PrendaBase base,ETrama trama, Color colorPrimario) {
        this.base=base;
        this.colorPrimario = colorPrimario;
        this.trama=trama;
    }

    public Prenda(PrendaBase base, ETrama trama,Color colorPrimario, Color colorSecundario) {
        this.base=base;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama=trama;
    }
    public Categoria getCategoria(){
        return base.getCategoria();
    }
    public String getNombre(){
        return base.getNombre();
    }
}
