package QueOutfit;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    static Color azul(){
        return new Color(0,0,255);
    }
    static Color red(){
        return new Color(255,0,0);
    }
}
