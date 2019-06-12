package QueOutfit.AccuWeatherTests;
import QueOutfit.Excepciones.ArchivoNoEncontrado;
import QueOutfit.ManageApiAccuWeather.DTODatoClimatico;
import com.google.gson.Gson;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClimaJsonAccuWeather{
    public ClimaJsonAccuWeather(){}
   public static List<DTODatoClimatico> getDatosClimaticos() {
        DTODatoClimatico[] datos;
        Gson gson = new Gson();
        BufferedReader br = null;
        try{
            String path="./src/test/java/QueOutfit/AccuWeatherTests/AccuClima.json";
            br = new BufferedReader(new FileReader(path));
            datos = gson.fromJson(br, DTODatoClimatico[].class);
            return Arrays.stream(datos).collect(Collectors.toList());
        } catch  (FileNotFoundException e){
            e.printStackTrace();
            throw new ArchivoNoEncontrado();
        }
    }
}
