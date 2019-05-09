package QueOutfit.PrendasElementos;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public static Color azul(){
        return new Color(0,0,255);
    }
    public static Color red(){
        return new Color(255,0,0);
    }
    public static Color verde(){
        return new Color(0,255,0);
    }
    public static Color gris(){
        return new Color(139,136,126);
    }
    public static Color blanco(){
        return new Color(255,255,255);
    }
    public static Color negro(){
        return new Color(0,0,0);
    }
}
