package QueOutfit.PrendasElementos;

import QueOutfit.Excepciones.Filtrador;

public class BorradorPrenda {
    private EMaterial material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private ETrama trama;
    private int temperatura;
    private ETipo tipo;
    private Filtrador filtrador;
    public BorradorPrenda(ETipo tipo){

    }
    public EMaterial getMaterial() {
        return material;
    }
    public int getTemperaturaMaxima(){
        return temperatura;
    }
    public void setTemperaturaMaxima(int temperatura){
        this.temperatura=temperatura;
    }
    public ETipo getTipo() {
        return tipo;
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
                throw  new RuntimeException("Las variables aun no son válidas");

            if(colorSecundario==null)
                return new Prenda(new PrendaBase(tipo,material,temperatura),trama, colorPrincipal);
            return new Prenda(new PrendaBase(tipo,material,temperatura),trama,colorPrincipal,colorSecundario);
    }


}
