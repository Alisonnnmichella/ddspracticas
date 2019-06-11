package QueOutfit.ManageApiAccuWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface RetrofitClimaService {
    @GET("/forecasts/v1/hourly/12hour/7894")
    Call<List<DTODatoClimatico>> listWeather(
            @Query("apikey")String apiKey,
            @Query("datails")String details,
            @Query("metric")String metric
            );
}
