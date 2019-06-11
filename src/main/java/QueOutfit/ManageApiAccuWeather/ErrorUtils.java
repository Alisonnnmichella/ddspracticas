package QueOutfit.ManageApiAccuWeather;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;

public class ErrorUtils {

    public APIError parseError(Response<List<DTODatosClimaticos>> response) {
      return new APIError(response.message(), response.code());
    }
}