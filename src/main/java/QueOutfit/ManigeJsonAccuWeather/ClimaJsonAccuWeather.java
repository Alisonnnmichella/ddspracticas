package QueOutfit.ManigeJsonAccuWeather;
import QueOutfit.PrendasElementos.Clima;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import org.joda.time.LocalTime;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ClimaJsonAccuWeather implements Clima {
    JsonParser parser;
    InputStream inputStream;
    Reader reader;
    DODateTimeAccuWeather[] datos;
    public ClimaJsonAccuWeather(){
        this.iniciatize();
    }
    private void iniciatize() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try{
            String path="./src/main/java/QueOutfit/ManigeJsonAccuWeather/AccuClima.json";
            br = new BufferedReader(new FileReader(path));
            datos = gson.fromJson(br, DODateTimeAccuWeather[].class);
        } catch  (FileNotFoundException e){
            e.printStackTrace();
        }
    }


    public int getTemperatura(){
        LocalTime localTime = new LocalTime();
        return Arrays.asList(datos).stream().filter(d->d.getHour()==localTime.getHourOfDay())
                .collect(Collectors.toList()).get(0)
                .getTemperature().getValue();
    }


}
