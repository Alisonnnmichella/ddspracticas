package QueOutfit.ManageApiAccuWeather;
import QueOutfit.Excepciones.AccuWeatherException;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;

import java.util.List;
import java.util.stream.Collectors;

public class AccuWeatherAdapter{
    List<DTODatoClimatico> datosClimaticos;
    String apikey;
    DateTime dateTimeInicio;
    public AccuWeatherAdapter(String apikey){
        this.apikey=apikey;
        requestWeatherData();
        dateTimeInicio=DateTime.now();
    }

    public void requestWeatherData(){
        Connection connection= new Connection();
        datosClimaticos=connection.getDatos(apikey);
    }
    public boolean puedeObtenerTemperaturaEnFecha(DateTime dateTime){
        return  (horasDeDiferencia(dateTime,dateTimeInicio)>=0)
             && (Math.abs(horasDeDiferencia(dateTime,DateTime.now()))<12);
    }
    public boolean esNecesarioHacerRequest(){
        if(datosClimaticos==null)
            return true;
        return datosClimaticos.stream()
               .allMatch(datoClimatico->horasDeDiferencia(datoClimatico.getDateTime(),DateTime.now())<0);
    }
    private int horasDeDiferencia(DateTime dateTime1,DateTime dateTime2){
        return (Hours.hoursBetween(dateTime1,dateTime2).getHours());
    }
    private int minutosDeDiferencia(DateTime dateTime1,DateTime dateTime2){
        return (Minutes.minutesBetween(dateTime1,dateTime2).getMinutes());
    }
    public double obtenerTemperatura(DateTime dateTime) {
        if(!puedeObtenerTemperaturaEnFecha(dateTime))
            throw new AccuWeatherException("Fecha y/o horario incongruente con el sistema");
        if(esNecesarioHacerRequest())
            requestWeatherData();
          DTODatoClimatico datoClimatico =datosClimaticos.stream()
                .filter(dato->Math.abs(minutosDeDiferencia(dateTime,dato.getDateTime()))<60)
                .collect(Collectors.toList())
                .get(0);
          if(datoClimatico==null)
              throw new AccuWeatherException("Dato climatico nulo!");
          return datoClimatico.getTemperature().getValue();
    }
    public double getTemperaturaEnCelcius(DateTime date){
       return  (obtenerTemperatura(date)-32.0)*(5.0/9.0);
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}
