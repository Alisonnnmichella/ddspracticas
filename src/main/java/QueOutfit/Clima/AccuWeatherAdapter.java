package QueOutfit.Clima;
import QueOutfit.Excepciones.AccuWeatherException;
import QueOutfit.ManageApiAccuWeather.Connection;
import QueOutfit.ManageApiAccuWeather.DTODatoClimatico;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class AccuWeatherAdapter{
    List<DTODatoClimatico> datosClimaticos;
    String apikey;
    DateTime dateTimeInicio;

    public AccuWeatherAdapter(String apikey){
        this.apikey=apikey;
    }
    //le pide informacion a la api externa

    public List<DTODatoClimatico> requestWeatherData(){
        Connection connection= new Connection();

        return connection.getDatos(apikey);
    }

    public boolean puedeObtenerTemperaturaEnFecha(DateTime dateTime){
        if(dateTimeInicio==null)
            setearHoraDeInicio();
        return  ((minutosDeDiferencia(dateTimeInicio,dateTime)>= -60)
                && (minutosDeDiferencia(dateTimeActual(),dateTime)<((13*60)-1)));
    }

    private void setearHoraDeInicio(){
        DateTime inicio=dateTimeActual().plusHours(1);
        dateTimeInicio= new DateTime(inicio.getYear(),
                inicio.getMonthOfYear(),inicio.getDayOfMonth(),
                inicio.getHourOfDay(),0,0
                );
    }
    public boolean esNecesarioHacerRequest(){
        if(datosClimaticos==null) {
            setearHoraDeInicio();
            return true;
        }
        return datosClimaticos.stream()
               .allMatch(datoClimatico->horasDeDiferencia(datoClimatico.getDateTime(),dateTimeActual())<0);
    }
    public int horasDeDiferencia(DateTime datemen,DateTime datemay){
        return Hours.hoursBetween(datemen,datemay).getHours();

    }

    public int minutosDeDiferencia(DateTime dateTime1,DateTime dateTime2){
        return (Minutes.minutesBetween(dateTime1,dateTime2).getMinutes());
    }

    public double obtenerTemperatura(DateTime dateTime){
        if(!puedeObtenerTemperaturaEnFecha(dateTime))
            throw new AccuWeatherException("Fecha y/o horario incongruente con el sistema");
        if(esNecesarioHacerRequest())
            datosClimaticos=requestWeatherData();
        int menorDiferencia=menorDiferenciaEnMinutosALaHora(dateTime);

        List<DTODatoClimatico> cacheAuxiliarDatosClimaticos=datosClimaticos.stream()
                .filter(dato->Math.abs(minutosDeDiferencia(dateTime,dato.getDateTime()))==menorDiferencia)
                .collect(Collectors.toList());

        if(cacheAuxiliarDatosClimaticos==null)
            throw new AccuWeatherException("Lista nula de DTODatoClimaticos");

        DTODatoClimatico datoClimatico=cacheAuxiliarDatosClimaticos.get(0);
        if(cacheAuxiliarDatosClimaticos.size()>1)
            datoClimatico=obtenerElDTODeLaSiguienteHora(cacheAuxiliarDatosClimaticos);
        return datoClimatico.getTemperature().getValue();
        }

    public DTODatoClimatico obtenerElDTODeLaSiguienteHora(List<DTODatoClimatico> datosClimaticos){
        if(horasDeDiferencia(datosClimaticos.get(0).getDateTime(),datosClimaticos.get(1).getDateTime())>0)
            return datosClimaticos.get(1);
        return datosClimaticos.get(0);
    }

    public int menorDiferenciaEnMinutosALaHora(DateTime datetime){
        OptionalInt menorDiferencia =datosClimaticos.stream()
                .mapToInt(dato->Math.abs(minutosDeDiferencia(datetime,dato.getDateTime())))
                .min();
        if(!menorDiferencia.isPresent())
            throw new AccuWeatherException("No se pudo obtener la menor diferencia en minutos." +
                    ",\n Algo fallo en menorDiferenciaEnMinutos(Datetime datetime)");
            return menorDiferencia.getAsInt();
    }

    public double getTemperaturaEnCelcius(DateTime date){
       return  (obtenerTemperatura(date)-32.0)*(5.0/9.0);
    }

    public DateTime dateTimeActual(){
        return DateTime.now();
    }

    public DateTime getDateTimeInicio(){
        if(dateTimeInicio==null)
            setearHoraDeInicio();
        return dateTimeInicio;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}
