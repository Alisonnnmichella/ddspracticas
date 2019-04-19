package QueOutfit;

public class Tela implements Material {
    private ETrama textura;
    private EMaterial material;

    public Tela( EMaterial material,ETrama textura) {
        this.textura = textura;
        this.material=material;
    }
    public EMaterial getMaterial(){
        return material;
    }


}
