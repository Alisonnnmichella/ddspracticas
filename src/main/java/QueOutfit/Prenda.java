package QueOutfit;

public class Prenda {
    private ETipo tipo;
    private EMaterial material;
    private ETrama trama;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(ETipo tipo, EMaterial material,ETrama trama, Color colorPrimario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.trama=trama;
    }

    public Prenda(ETipo tipo, EMaterial material, ETrama trama,Color colorPrimario, Color colorSecundario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama=trama;
    }
}
