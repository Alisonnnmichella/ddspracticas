package QueOutfit;

public class AtuendoEnterizo {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda prendaCalzado;

    public AtuendoEnterizo(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado) {
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
