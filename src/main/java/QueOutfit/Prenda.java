package QueOutfit;

public class Prenda {
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(Tipo tipo, Color colorPrimario) {
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
    }

    public Prenda(Tipo tipo, Color colorPrimario, Color colorSecundario) {
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }
}
