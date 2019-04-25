package QueOutfit;

public class Sucia implements Estado {
    int maxUso=2;
    public boolean sugerencia(Prenda prenda){
        maxUso--;
        if(maxUso==0);
        prenda.setEstado(new Percudida());
        return true;
    }
}
