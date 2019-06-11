package QueOutfit.AccuWeatherTests;

import QueOutfit.ManageApiAccuWeather.DTODatoClimatico;
import org.junit.Test;

import java.util.Set;

public class APIAccuWeatherTest {
    @Test
    public void parsearDatosJson(){
      Set<DTODatoClimatico> datosClimaticos= ClimaJsonAccuWeather.getDatosClimaticos();
    }
}
