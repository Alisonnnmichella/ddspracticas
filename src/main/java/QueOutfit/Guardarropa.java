package QueOutfit;

import java.util.HashSet;

public class Guardarropa {
    HashSet<Prenda> prendas;
    public Guardarropa(){
        prendas= new HashSet<>();
    }
    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }
    public void quitarPrenda(Prenda prenda){
        prendas.remove(prenda);
    }

}
