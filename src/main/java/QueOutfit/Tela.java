package QueOutfit;

public class Tela implements Material {
    private ETrama trama;
    private EMaterial material;

    public Tela( EMaterial material,ETrama trama) {
        this.trama=trama;
        this.material=material;
    }
    public Tela(EMaterial material){
        this.material=material;
        this.trama=trama;
    }
    public EMaterial getMaterial(){
        return material;
    }


}
