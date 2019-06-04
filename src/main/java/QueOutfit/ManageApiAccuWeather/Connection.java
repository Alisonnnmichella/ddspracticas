package QueOutfit.ManageApiAccuWeather;
import QueOutfit.Excepciones.RetrofitException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Connection {

    RetrofitClimaService service;
    public Connection(){}
    public void makeConnection() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service= retrofit.create(RetrofitClimaService.class);

    }
    public  List<DTODatosClimaticos> getDatos(String apikey) {
        Call<List<DTODatosClimaticos>> call = service.listWeather(
                apikey, "false", "false");
        try {
            Response<List<DTODatosClimaticos>> response = call.execute();
            if(!response.isSuccessful())
                throw new RetrofitException(response.message());

            List<DTODatosClimaticos> datos = response.body();

            return datos;
        } catch (IOException exception) {
            exception.printStackTrace();
            throw new RuntimeException();
        }

}
}





