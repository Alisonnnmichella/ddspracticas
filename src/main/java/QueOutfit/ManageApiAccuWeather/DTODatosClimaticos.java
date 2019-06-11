package QueOutfit.ManageApiAccuWeather;
import QueOutfit.Excepciones.AccuWeatherException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class DTODatosClimaticos {

    @SerializedName("DateTime")
    @Expose
    private String dateTime;

    @SerializedName("Temperature")
    @Expose
    private DTOTemperatureAccuWeather temperature;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public DTOTemperatureAccuWeather getTemperature() {
        return temperature;
    }

    public void setTemperature(DTOTemperatureAccuWeather temperature) {
        this.temperature = temperature;
    }

    public DateTime getLocalDateTime() {
        try {
            String pattern = "yyyy-MM-dd'T'HH:mm:ssZ";
            DateTime localDateTime = DateTime.parse(dateTime, DateTimeFormat.forPattern(pattern));
            return localDateTime;
            }catch (Exception e) {
                throw new AccuWeatherException("No se pudo parsear " + dateTime);
            }
    }
}