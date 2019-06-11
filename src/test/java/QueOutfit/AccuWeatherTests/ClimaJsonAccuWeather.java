package QueOutfit.AccuWeatherTests;
import QueOutfit.Excepciones.ArchivoNoEncontrado;
import QueOutfit.ManageApiAccuWeather.DTODatosClimaticos;
import com.google.gson.Gson;

import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ClimaJsonAccuWeather{
    public ClimaJsonAccuWeather(){}
   public static Set<DTODatosClimaticos> getDatosClimaticos() {
        DTODatosClimaticos[] datos;
        Gson gson = new Gson();
        BufferedReader br = null;
        try{
            String path="./src/test/java/QueOutfit/AccuWeatherTests/AccuClima.json";
            br = new BufferedReader(new FileReader(path));
            datos = gson.fromJson(br, DTODatosClimaticos[].class);
            return Arrays.stream(datos).collect(Collectors.toSet());
        } catch  (FileNotFoundException e){
            e.printStackTrace();
            throw new ArchivoNoEncontrado();
        }
    }
}
