package QueOutfit;

public class Prenda {
    private ETipo tipo;
    private EMaterial material;
    private ETrama trama;
    private Color colorPrimario;
    private Color colorSecundario;
    private Estado estado;
    public Prenda(ETipo tipo, EMaterial material,ETrama trama, Color colorPrimario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.trama=trama;
        this.estado=new Limpia();
    }

    public Prenda(ETipo tipo, EMaterial material, ETrama trama,Color colorPrimario, Color colorSecundario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama=trama;
        this.estado=new Limpia();
    }
    public void setEstado(Estado estado){
        this.estado=estado;
    }
    public void ponerALavar(){
        estado=new Limpiando();
    }
    public void limpiezaTerminada(){
        estado= new Limpia();
    }
    public Categoria getCategoria(){
        return tipo.getCategoria();
    }
    public String getNombre(){
        return tipo.name();
    }
    public boolean disponible(){
        return estado.sugerencia(this);
    }
}
