package QueOutfit.AccuWeatherTests;

import QueOutfit.ManageApiAccuWeather.DTODatosClimaticos;
import org.junit.Test;

import java.util.Set;

public class APIAccuWeatherTest {
    @Test
    public void parsearDatosJson(){
      Set<DTODatosClimaticos> datosClimaticos= ClimaJsonAccuWeather.getDatosClimaticos();
    }
}
