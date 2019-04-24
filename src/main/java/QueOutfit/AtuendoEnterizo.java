package QueOutfit;

public class AtuendoEnterizo {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda prendaCalzado;
    Prenda prendaAccesorio;
    public AtuendoEnterizo(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado) {
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.prendaCalzado = prendaCalzado;
    }

    public AtuendoEnterizo(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado, Prenda prendaAccesorio) {
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.prendaCalzado = prendaCalzado;
        this.prendaAccesorio = prendaAccesorio;
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
