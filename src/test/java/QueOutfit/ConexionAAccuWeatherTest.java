package QueOutfit;

import QueOutfit.Excepciones.RetrofitServerException;
import QueOutfit.ManageApiAccuWeather.Connection;
import QueOutfit.ManageApiAccuWeather.DTODatosClimaticos;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import retrofit2.Response;
import org.mockito.Mockito.*;
import retrofit2.Retrofit;

import java.util.List;

import static org.mockito.Mockito.when;

public class ConexionAAccuWeatherTest {
    Connection connection;
    List<DTODatosClimaticos> datos;

    @Mock
    Response<List<DTODatosClimaticos>> response;


    @Before
        public void initialize() {
        connection =new Connection();
        connection.makeConnection();//IHpzr3ruKF7pm0bEMlDtCJ2vJUGGhb8T
        when(response.isSuccessful()).thenReturn(true);


    }
    @Test
    public void pruebaDeconexion(){
        connection.getDatos("IHpzr3ruKF7pm0bEMlDtCJ2vJUGGhb8T");
    }
    @Test (expected= RetrofitServerException.class)
    public void pruebaDeConexion(){
        connection.getDatos("s");
    }
}
