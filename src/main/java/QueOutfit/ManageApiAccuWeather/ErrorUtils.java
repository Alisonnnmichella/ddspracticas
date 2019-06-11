package QueOutfit.ManageApiAccuWeather;

import retrofit2.Response;

import java.util.List;

public class ErrorUtils {

    public APIError parseError(Response<List<DTODatoClimatico>> response) {
      return new APIError(response.message(), response.code());
    }
}