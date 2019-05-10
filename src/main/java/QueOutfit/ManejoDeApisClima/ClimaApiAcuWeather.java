package QueOutfit.ManejoDeApisClima;
import QueOutfit.PrendasElementos.Clima;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.io.*;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class ClimaApiAcuWeather implements Clima {
    JsonParser parser;
    InputStream inputStream;
    Reader reader;
    DateTime[] datos;
    public ClimaApiAcuWeather(){
        this.iniciatize();
    }
    private void iniciatize() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try{
            br = new BufferedReader(
             new FileReader("./src/main/java/QueOutfit/ManejoDeApisClima/AccuClima.json"));
            datos = gson.fromJson(br, DateTime[].class);
        } catch  (FileNotFoundException e){
            e.printStackTrace();
        }
    }


    public int getTemperatura(){
        OffsetDateTime dateTime = OffsetDateTime.now();
        Arrays.stream(datos).filter(datos->datos.getDateTime()==dateTime.getHour())
        return 20;
    }
}
