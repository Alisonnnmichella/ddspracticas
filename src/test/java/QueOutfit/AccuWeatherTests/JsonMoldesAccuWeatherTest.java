package QueOutfit.AccuWeatherTests;

import QueOutfit.ManageApiAccuWeather.DTODatoClimatico;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JsonMoldesAccuWeatherTest {
    List<DTODatoClimatico> datosClimaticos;
    @Before
    public void inicializar(){
       datosClimaticos= ClimaJsonAccuWeather.getDatosClimaticos();
    }
    @Test
    public void doceDatosClimaticos(){
      assert (datosClimaticos.size()==12);
    }
    @Test
    public void doceTemperaturasExtraidasDeLosDoceDatosClimaticos(){
        assert(datosClimaticos.stream().map(dato->dato.getTemperature()).collect(Collectors.toList()).size()==12);
    }

}
