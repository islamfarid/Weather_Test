package com.example.islam.weather.network;

import com.example.islam.weather.common.Constants;
import com.example.islam.weather.models.weather.WeatherModel;
import com.example.islam.weather.network.weather.WeatherInterface;

import javax.inject.Inject;

import retrofit.RestAdapter;
import retrofit.converter.JacksonConverter;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by islam on 03/03/16.
 */
public class NetworkManager {
    private WeatherInterface weatherInterface;

    @Inject
    public NetworkManager() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.END_POINT)
                .setLogLevel(RestAdapter.LogLevel.FULL).setConverter(new JacksonConverter())
                .build();
        this.weatherInterface = restAdapter.create(WeatherInterface.class);
    }


    public Observable<WeatherModel> getWeatherData(@Path("api_key") String apiKey, @Path("latitudeAndlongitudeAndtime") String longitudeAndLatitudeAndTime) {
        return weatherInterface.getWeatherData(apiKey, longitudeAndLatitudeAndTime);
    }

}
