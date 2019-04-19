package QueOutfit;

public class Tipo {
    private Categoria categoria;
    private EMaterial material;

    public Tipo(Categoria categoria, EMaterial material) {
        this.categoria = categoria;
        this.material = material;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public EMaterial getMaterial(){
        return material;
    }
    public static Tipo REMERA_ALGODON(){
        return new Tipo(Categoria.SUPERIOR, EMaterial.ALGODON);
    }
    public static Tipo CAMISA_SEDA(){
        return new Tipo(Categoria.SUPERIOR, EMaterial.SEDA);
    }
    public static Tipo PANTALON_VESTIR(){
        return new Tipo(Categoria.INFERIOR, EMaterial.LINO);
    }


}
