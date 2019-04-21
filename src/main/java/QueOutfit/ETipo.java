package QueOutfit;

public enum ETipo {
        REMERA(Categoria.SUPERIOR),SHORT(Categoria.INFERIOR),PANTALON(Categoria.INFERIOR),
        ZAPATILLAS(Categoria.CALZADO),BUZO(Categoria.SUPERIOR),ZAPATOS(Categoria.CALZADO),
        CHOMBA(Categoria.SUPERIOR),CAMISA(Categoria.SUPERIOR),PANTALON_DE_VESTIR(Categoria.INFERIOR);
       private Categoria categoria;
       private ETipo(Categoria categoria){
               this.categoria=categoria;
       }

    public Categoria getCategoria() {
        return categoria;
    }
}
