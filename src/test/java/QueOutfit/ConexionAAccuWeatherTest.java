package QueOutfit;

import QueOutfit.Excepciones.RetrofitException;
import QueOutfit.ManageApiAccuWeather.Connection;
import QueOutfit.ManageApiAccuWeather.DTODatosClimaticos;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.stream.Collectors;

public class ConexionAAccuWeatherTest {
    Connection connection;
    List<DTODatosClimaticos> datos;
    @Before
    public void initialize() {
        connection =new Connection();
        connection.makeConnection();//IHpzr3ruKF7pm0bEMlDtCJ2vJUGGhb8T

        //
    }

    @Test (expected= RetrofitException.class)
    public void pruebaDeConexion(){
        datos= connection.getDatos("s");
        assert (!datos.isEmpty());
    }

}
