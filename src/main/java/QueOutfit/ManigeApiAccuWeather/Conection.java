package QueOutfit.ManigeApiAccuWeather;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Conection {
    public Conection(){}
    public List<DTODatosClimaticos>  makeConection(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitClimaService service = retrofit.create(RetrofitClimaService.class);


        try{
            Response<List<DTODatosClimaticos>> response = service.listWeather(
                    "IHpzr3ruKF7pm0bEMlDtCJ2vJUGGhb8T","false","false").execute();
            List<DTODatosClimaticos> datos =response.body();

            return datos;
        }
        catch (Exception ex){
            throw new RuntimeException("Error");
        }
    }

}
