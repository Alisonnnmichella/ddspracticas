package QueOutfit.AccuWeatherTests;

import QueOutfit.ManageApiAccuWeather.AccuWeatherAdapter;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class AccuWeatherAdapterTest {
    @Mock
    AccuWeatherAdapter accuWeatherAdapter;


    DateTime dateTime1;
    DateTime dateTime2;
    DateTime dateTime3;
    DateTime dateTime4;
    DateTime dateTime5;



    @Before
    public void inicialize(){
        dateTime1=
                new DateTime(2019, 05, 03, 12, 40);

        accuWeatherAdapter=new AccuWeatherAdapter("test");
        MockitoAnnotations .initMocks(this);
        when(accuWeatherAdapter.dateTimeActual()).thenReturn(dateTime1);
        when(accuWeatherAdapter.requestWeatherData()).thenReturn(ClimaJsonAccuWeather.getDatosClimaticos());
        dateTime2=
                new DateTime(2019, 05, 03, 14, 00);
        dateTime3=
                new DateTime(2019, 05, 03, 17, 00);
        dateTime4=
                new DateTime(2019, 04, 03, 17, 00);
        dateTime5=
                new DateTime(2018, 05, 03, 17, 00);

    }
    @Test
    public  void puedeParsearYObtenerLosDTO(){
        assert (accuWeatherAdapter.requestWeatherData().size()==12);
        }
    @Test
    public void validaFechaActualSegunMock(){
        assert (accuWeatherAdapter.dateTimeActual().getYear()==dateTime1.getYear());
        assert (accuWeatherAdapter.dateTimeActual().getMonthOfYear()==dateTime1.getMonthOfYear());
        assert (accuWeatherAdapter.dateTimeActual().getDayOfMonth()==dateTime1.getDayOfMonth());
        assert (accuWeatherAdapter.dateTimeActual().getHourOfDay()==dateTime1.getHourOfDay());
        }

    @Test
    public void validacionDeFechasCorrecta(){
        assert (accuWeatherAdapter.puedeObtenerTemperaturaEnFecha(dateTime2));
    }
}
