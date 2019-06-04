package QueOutfit.PrendasElementos;

import QueOutfit.Filtros.Filtrador;

public class BorradorPrenda {
    private EMaterial material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private ETrama trama;
    private ETipo tipo;
    private Filtrador filtrador;
    public BorradorPrenda(ETipo tipo){
        this.tipo=tipo;

    }
    public EMaterial getMaterial() {
        return material;
    }

    public void setMaterial(EMaterial material) {
        this.material = material;

    }

    public void setTrama(ETrama trama){
        this.trama=trama;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal=colorPrincipal;
    }

    public void setColorSecundario(Color colorSecundario) {
        if(this.colorPrincipal==null)
            throw new RuntimeException("Debe colocar el color primario antes!");
        this.colorSecundario = colorSecundario;
    }
    private boolean variablesValidas(){
       if(tipo==null||material==null||colorPrincipal==null)
           return false;
       return true;
    }
    public Prenda contruirPrenda(){
            if(!this.variablesValidas())
                throw  new RuntimeException("Las variables aún no son válidas");

            if(colorSecundario==null)
                return new Prenda(new PrendaBase(tipo,material),trama, colorPrincipal);
            return new Prenda(new PrendaBase(tipo,material),trama,colorPrincipal,colorSecundario);
    }


}
