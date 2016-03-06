package com.example.islam.weather.network.weather;

import com.example.islam.weather.models.weather.WeatherModel;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by islam on 03/03/16.
 */
public interface WeatherInterface {
    @GET("/{api_key}/{latitudeAndlongitudeAndtime}/")
    Observable<WeatherModel> getWeatherData(@Path("api_key") String apiKey, @Path("latitudeAndlongitudeAndtime") String longitudeAndLatitude);
}
