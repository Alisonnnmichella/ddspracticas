package QueOutfit;

import QueOutfit.ManejoDeApisClima.ClimaApiAcuWeather;
import QueOutfit.PrendasElementos.Clima;
import org.joda.time.LocalTime;
import org.junit.Test;

public class ClimaTest {
    @Test
    public void implementarClima(){
        LocalTime localTime = new LocalTime();
        Clima clima= new ClimaApiAcuWeather();
        assert(clima.getTemperatura()==57);
    }


}
