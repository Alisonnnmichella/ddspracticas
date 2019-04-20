package QueOutfit;

import java.util.ArrayList;

public class BorradorPrenda {

   private Material material;
   private Color colorPrincipal;
   private Color colorSecundario;
   private Tela tela;
   private ETrama trama;
   private ETipo tipo;
   private Filtrador filtrador;
    public BorradorPrenda(ETipo tipo){
        this.tipo=tipo;
        this.filtrador=new Filtrador();
    }

    public Material getMaterial() {
        return material.getMaterial();
    }

    public ETipo getTipo() {
        return tipo;
    }



   public void setMaterial(Material material) {
        this.material = material;
        trama=ETrama.LISA;
    }
    public void setTela(Tela tela){
        material=tela;
        tela=tela;
    }

    public void setTrama(ETrama trama){
        if(tela==null)
            throw  new RuntimeException("Debe setear tela");
        tela=new Tela(tela.getMaterial(),trama);
        material=tela;
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
            if(!filtrador.pasaFiltro(this)){
                throw new RuntimeException("Las variables no tienen sentido juntas");
            }
            if(colorSecundario==null)
                return new Prenda(tipo, material, colorPrincipal);
            return new Prenda(tipo,material,colorPrincipal,colorSecundario);

    }


}
