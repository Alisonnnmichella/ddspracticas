package QueOutfit;

public class Uniforme {
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda prendaCalzado;

    public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado) {
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.prendaCalzado = prendaCalzado;
    }

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public Prenda getPrendaCalzado() {
        return prendaCalzado;
    }
}
