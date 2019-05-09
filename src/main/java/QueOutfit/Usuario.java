package QueOutfit;

import QueOutfit.PrendasElementos.Guardarropa;

import java.util.HashSet;

public class Usuario {
    HashSet <Guardarropa> guardarropas;

    public Usuario(Guardarropa guardarropa) {
        this.guardarropas = new HashSet<>();
        guardarropas.add(guardarropa);
    }

    public void agregarGuadarropa(Guardarropa guard){
        guardarropas.add(guard);
    }
    public void removerGuardarropa(Guardarropa guard){
        guardarropas.remove(guard);
    }
    public HashSet <Guardarropa> obtenerGuardarropas(){
        return guardarropas;
    }
}
