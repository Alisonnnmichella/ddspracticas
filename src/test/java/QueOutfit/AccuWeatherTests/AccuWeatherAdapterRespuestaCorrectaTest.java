package QueOutfit.AccuWeatherTests;

import QueOutfit.Clima.AccuWeatherAdapter;
import QueOutfit.Excepciones.AccuWeatherException;
import QueOutfit.Excepciones.RetrofitServerException;
import QueOutfit.ManageApiAccuWeather.DTODatoClimatico;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

public class AccuWeatherAdapterRespuestaCorrectaTest {
    @Mock
    AccuWeatherAdapter accuWeatherAdapter;
    DateTime dateTime1;
    @Before
    public void inicialize(){
        dateTime1=
                new DateTime(2019, 06, 11, 11, 00);

        accuWeatherAdapter=new AccuWeatherAdapter("test");
        MockitoAnnotations .initMocks(this);
        when(accuWeatherAdapter.dateTimeActual()).thenReturn(dateTime1);
        when(accuWeatherAdapter.requestWeatherData()).thenReturn(ClimaJsonAccuWeather.getDatosClimaticos());
        when(accuWeatherAdapter.esNecesarioHacerRequest()).thenCallRealMethod();
        when(accuWeatherAdapter.horasDeDiferencia(any(DateTime.class),any(DateTime.class))).thenCallRealMethod();
        when(accuWeatherAdapter.puedeObtenerTemperaturaEnFecha(any(DateTime.class))).thenCallRealMethod();
        when(accuWeatherAdapter.minutosDeDiferencia(any(DateTime.class),any(DateTime.class))).thenCallRealMethod();
        when(accuWeatherAdapter.getDateTimeInicio()).thenCallRealMethod();
        when(accuWeatherAdapter.getTemperaturaEnCelcius(any(DateTime.class))).thenCallRealMethod();
        when(accuWeatherAdapter.obtenerTemperatura(any(DateTime.class))).thenCallRealMethod();
        when(accuWeatherAdapter.menorDiferenciaEnMinutosALaHora(any(DateTime.class))).thenCallRealMethod();
        when(accuWeatherAdapter.obtenerElDTODeLaSiguienteHora(any())).thenCallRealMethod();
    }
    @Test
    public  void puedeParsearYObtenerLosDTO(){
        assert (accuWeatherAdapter.requestWeatherData().size()==12);
        }

    @Test
    public void horaDeInicioEsLaSiguienteALaActual(){
        assert (accuWeatherAdapter.getDateTimeInicio().getHourOfDay()==12);
    }

    @Test
    public void unaHoraYUnminutoAntesDelTiempoDeInicioNoSePuedePedirElClima(){
        DateTime dateTimeprueba=new DateTime(2019, 06, 11, 10, 59);
        assert(!accuWeatherAdapter.puedeObtenerTemperaturaEnFecha(dateTimeprueba));
    }

    @Test
    public void unaHoraAntesDelTiempoDeInicioSePuedePedirElClima(){
        DateTime dateTimeprueba=
                new DateTime(2019, 06, 11, 11, 00);
        assert (accuWeatherAdapter.puedeObtenerTemperaturaEnFecha(dateTimeprueba));
    }
    @Test
    public void treceHorasDespuesDeLaHoraActualNoSePuedePedirLaTemperatura(){
        DateTime dateTimeprueba=
                new DateTime(2019, 06, 11, 00, 00);
        assert (!accuWeatherAdapter.puedeObtenerTemperaturaEnFecha(dateTimeprueba));
    }

    @Test
    public void validaFechaActualSegunMock(){
        assert (accuWeatherAdapter.dateTimeActual().getYear()==dateTime1.getYear());
        assert (accuWeatherAdapter.dateTimeActual().getMonthOfYear()==dateTime1.getMonthOfYear());
        assert (accuWeatherAdapter.dateTimeActual().getDayOfMonth()==dateTime1.getDayOfMonth());
        assert (accuWeatherAdapter.dateTimeActual().getHourOfDay()==dateTime1.getHourOfDay());
    }
    @Test(expected = AccuWeatherException.class)
    public void laTemperaturaALas12y20DeUnAñoAntesNoSePuedeObtener(){
        DateTime dateTime23=
                new DateTime(2018, 06, 11, 12, 20);
        accuWeatherAdapter.requestWeatherData();
        assert(accuWeatherAdapter.obtenerTemperatura(dateTime23)==50);
    }
    @Test
    public void laTemperaturaALas13y20(){
        DateTime dateTime23=
                new DateTime(2019, 06, 11, 13, 20);
        accuWeatherAdapter.requestWeatherData();
        assert(accuWeatherAdapter.obtenerTemperatura(dateTime23)==62);
    }
    @Test
    public void laTemperaturaALas13y40(){
        DateTime dateTime23=
                new DateTime(2019, 06, 11, 13, 40);
        accuWeatherAdapter.requestWeatherData();
        assert(accuWeatherAdapter.obtenerTemperatura(dateTime23)==61);
    }
    @Test
    public void laTemperaturaALas13y30(){
        DateTime dateTime23=
                new DateTime(2019, 06, 11, 13, 30);
        accuWeatherAdapter.requestWeatherData();
        assert(accuWeatherAdapter.obtenerTemperatura(dateTime23)==61);
    }
    @Test
    public void diferenciaDeMinutos(){
        DateTime dateTime23=
                new DateTime(2019, 06, 11, 00, 40);

        List<DTODatoClimatico> datos= ClimaJsonAccuWeather.getDatosClimaticos();
        for(DTODatoClimatico dato:datos){
            System.out.println("*********************************");
            System.out.println(
                dato.getDateTime().getDayOfMonth()+"/"
                +dato.getDateTime().getMonthOfYear()+"/"
                + dato.getDateTime().getYear());
            System.out.println(dato.getDateTime().getHourOfDay());
            }
    }

    @Test(expected = RetrofitServerException.class)
    public void reaccionAApikeyIncorecta(){
        AccuWeatherAdapter accuWeatherAdapter2=new AccuWeatherAdapter("d");
        accuWeatherAdapter2.requestWeatherData();
    }

    @Test
    public void obtenerLaTemperatura(){
        AccuWeatherAdapter accuWeatherAdapter=new AccuWeatherAdapter("IHpzr3ruKF7pm0bEMlDtCJ2vJUGGhb8T");
        System.out.println(accuWeatherAdapter.obtenerTemperatura(DateTime.now()));
    }

}
