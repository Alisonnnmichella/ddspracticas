package QueOutfit;

import QueOutfit.ManejoDeApisClima.ClimaApiAcuWeather;
import QueOutfit.PrendasElementos.Clima;
import org.junit.Test;

public class ClimaTest {
    @Test
    public void implementarClima(){
        Clima clima= new ClimaApiAcuWeather();
    }


}
