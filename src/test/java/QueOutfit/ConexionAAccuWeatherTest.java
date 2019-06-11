package QueOutfit;

import QueOutfit.Excepciones.RetrofitServerException;
import QueOutfit.ManageApiAccuWeather.Connection;
import QueOutfit.ManageApiAccuWeather.DTODatoClimatico;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import retrofit2.Response;

import java.util.List;

import static org.mockito.Mockito.when;

public class ConexionAAccuWeatherTest {
    Connection connection;
    List<DTODatoClimatico> datos;

    @Mock
    Response<List<DTODatoClimatico>> response;


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
