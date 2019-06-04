package QueOutfit.PrendasElementos;

public enum ETipo {
        REMERA(Categoria.SUPERIOR,5),SWEATER(Categoria.SUPERIOR,8),CALZATERMICA(Categoria.INFERIOR,5),SHORT(Categoria.INFERIOR,5),PANTALON(Categoria.INFERIOR,7),
        ZAPATILLAS(Categoria.CALZADO,7),CAMPERA(Categoria.SUPERIOR,6),BUZO(Categoria.SUPERIOR,9),ZAPATOS(Categoria.CALZADO,10),
        CHOMBA(Categoria.SUPERIOR,5),CAMISA(Categoria.SUPERIOR,7),PANTALON_DE_VESTIR(Categoria.INFERIOR,7),
        GUANTES(Categoria.ACCESORIO,2),MEDIAS(Categoria.ACCESORIO,2),BUFANDA(Categoria.ACCESORIO,2),GORRO(Categoria.ACCESORIO,3),
        ANTEOJOS_DE_SOL(Categoria.ACCESORIO,0);
       private Categoria categoria;
       private int intensidadCalor;
       private ETipo(Categoria categoria,int intensidadCalor){
               this.categoria=categoria;
               this.intensidadCalor=intensidadCalor;
       }

    public Categoria getCategoria() {
        return categoria;
    }
    public int getIntensidadCalor(){
           return intensidadCalor;
    }
}
