package QueOutfit;

public class Limpia implements Estado {
    int maxUso=3;
    public boolean sugerencia(Prenda prenda){
        maxUso--;
        if(maxUso==0)
            prenda.setEstado(new Sucia());
        return true;
    }
}
