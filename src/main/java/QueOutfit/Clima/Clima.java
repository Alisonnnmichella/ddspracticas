package QueOutfit.Clima;
import org.joda.time.DateTime;

    public interface Clima {
        public double getTemperaturaEnCelcius(DateTime dateTime);
        public boolean puedeObtenerTemperatura(DateTime dateTime);
    }

