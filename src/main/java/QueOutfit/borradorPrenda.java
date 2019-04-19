package QueOutfit;

public class borradorPrenda {
   private Material material;
   private Color colorPrincipal;
   private Color colorSecundario;
   private Tela tela;
   private ETrama trama;
   private Tipo tipo;
   private Categoria categoria;
   public void setMaterial(Material material) {
        this.material = material;
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

}
