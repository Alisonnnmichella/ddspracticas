package QueOutfit;

public enum ETipo {
        REMERA(Categoria.SUPERIOR),SHORT(Categoria.INFERIOR),PANTALON(Categoria.INFERIOR),
        ZAPATILLAS(Categoria.CALZADO),BUZO(Categoria.SUPERIOR),ZAPATOS(Categoria.CALZADO),
        CHOMBA(Categoria.SUPERIOR),CAMISA(Categoria.SUPERIOR),PANTALON_DE_VESTIR(Categoria.INFERIOR),
        GUANTES(Categoria.ACCESORIO),BUFANDA(Categoria.ACCESORIO),GORRO(Categoria.ACCESORIO),
        ANTEOJOS_DE_SOL(Categoria.ACCESORIO);
       private Categoria categoria;
       private ETipo(Categoria categoria){
               this.categoria=categoria;
       }

    public Categoria getCategoria() {
        return categoria;
    }
}
