package QueOutfit.ManageApiAccuWeather;
import QueOutfit.Excepciones.RetrofitException;
import QueOutfit.Excepciones.RetrofitServerException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;

public class Connection {
    Retrofit retrofit;
    RetrofitClimaService service;
    public Connection(){}
    public void makeConnection() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service= retrofit.create(RetrofitClimaService.class);
    }

    public  List<DTODatoClimatico> getDatos(String apikey) {
        makeConnection();
        Call<List<DTODatoClimatico>> call = service.listWeather(
                apikey, "false", "false");
        try {
            Response<List<DTODatoClimatico>> response = call.execute();
            if(!response.isSuccessful()){
                handleError(response);
            }
            return response.body();
        } catch (IOException exception) {
            exception.printStackTrace();
            throw new RuntimeException();
        }

    }

    public void handleError(Response<List<DTODatoClimatico>> response){
        ErrorUtils errorUtils=new ErrorUtils();
        APIError apiError=errorUtils.parseError(response);
        throw new RetrofitServerException(apiError.getName());
    }

}

