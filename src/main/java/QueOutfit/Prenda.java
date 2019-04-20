package QueOutfit;

public class Prenda {
    private ETipo tipo;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(ETipo tipo, Material material, Color colorPrimario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
    }

    public Prenda(ETipo tipo, Material material, Color colorPrimario, Color colorSecundario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }
}
