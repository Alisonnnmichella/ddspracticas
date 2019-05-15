package QueOutfit;

import QueOutfit.ManigeApiAccuWeather.Conection;
import QueOutfit.ManigeApiAccuWeather.DTODatosClimaticos;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ConeccionAAccuWeatherTest {
    Conection conection;
    List<DTODatosClimaticos> datos;
    @Before
    public void initialize() {
        conection=new Conection();
        datos= conection.makeConection();
    }

    @Test
    public void pruebaDeConexion(){
        assert (!datos.isEmpty());
    }
    @Test
    public void pruebaDeTemperatura(){
        int hora=16;
        double valorTemperatura=datos.stream().filter(d->d.getHour()==hora)
                .collect(Collectors.toList()).get(0)
                .getTemperature().getValue();
        assert (valorTemperatura==65.0);
     }

}
