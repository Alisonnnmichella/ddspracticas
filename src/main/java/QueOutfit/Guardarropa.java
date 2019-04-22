package QueOutfit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
    public HashSet <Prenda> getPrendas(){
        return prendas;
    }

}
