package QueOutfit;

import QueOutfit.ManigeJsonAccuWeather.ClimaJsonAccuWeather;
import QueOutfit.PrendasElementos.Clima;
import org.junit.Test;

public class ClimaTest {
    @Test
    public void implementarClima(){
        Clima clima= new ClimaJsonAccuWeather();
        assert(clima.getTemperatura()==57);
    }


}
