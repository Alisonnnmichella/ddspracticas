package QueOutfit.PrendasElementos;

public enum ETipo {
        REMERA(Categoria.SUPERIOR,NivelAbrigo.LIVIANO),SWEATER(Categoria.SUPERIOR,NivelAbrigo.PESADO)
        ,CALZATERMICA(Categoria.INFERIOR,NivelAbrigo.PESADO),
        JOGGIN(Categoria.INFERIOR,NivelAbrigo.MEDIANO),
        SHORT(Categoria.INFERIOR,NivelAbrigo.LIVIANO),
        PANTALON(Categoria.INFERIOR,NivelAbrigo.MEDIANO),
        ZAPATILLAS(Categoria.CALZADO,NivelAbrigo.LIVIANO),
        CAMPERA(Categoria.SUPERIOR,NivelAbrigo.MEDIANO),
        BUZO(Categoria.SUPERIOR,NivelAbrigo.MEDIANO),
        ZAPATOS(Categoria.CALZADO,NivelAbrigo.MEDIANO),
        CHOMBA(Categoria.SUPERIOR,NivelAbrigo.MEDIANO),
        CAMISA(Categoria.SUPERIOR,NivelAbrigo.LIVIANO),
        PANTALON_DE_VESTIR(Categoria.INFERIOR,NivelAbrigo.LIVIANO),
        GUANTES(Categoria.ACCESORIO,NivelAbrigo.LIVIANO),
        MEDIAS(Categoria.ACCESORIO,NivelAbrigo.MEDIANO),
        BUFANDA(Categoria.ACCESORIO,NivelAbrigo.MEDIANO),
        GORRO(Categoria.ACCESORIO,NivelAbrigo.MEDIANO),
        ANTEOJOS_DE_SOL(Categoria.ACCESORIO,NivelAbrigo.NULO);
       private Categoria categoria;
       private NivelAbrigo nivelAbrigo;
       private ETipo(Categoria categoria,NivelAbrigo nivelAbrigo){
               this.categoria=categoria;
               this.nivelAbrigo=nivelAbrigo;
       }

    public Categoria getCategoria() {
        return categoria;
    }
    public NivelAbrigo getNivelAbrigo(){
           return nivelAbrigo;
    }
}
