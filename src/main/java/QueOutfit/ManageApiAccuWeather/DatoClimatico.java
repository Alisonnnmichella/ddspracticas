package QueOutfit.ManageApiAccuWeather;

import org.joda.time.DateTime;

public class DatoClimatico {

    private double temperatura;
    private DateTime fecha;

    public DatoClimatico(double temperatura, DateTime fecha) {
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    public double getTemperaturaEnCelcius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
    public DateTime getDateTime() {
        return fecha;
    }
}
