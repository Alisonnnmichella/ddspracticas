package QueOutfit.ManigeApiAccuWeather;

import QueOutfit.ManigeJsonAccuWeather.DODateTimeAccuWeather;

import java.util.ArrayList;
import java.util.List;

public class WeatherResponse {
    private List<DTODatosClimaticos> weatherData;
    public WeatherResponse(){
        weatherData=new ArrayList<>();
    }
}
