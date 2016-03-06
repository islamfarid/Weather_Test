package com.example.islam.weather.dagger.module;

import com.example.islam.weather.network.NetworkManager;
import com.example.islam.weather.service.weather.WeatherService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by islam on 04/03/16.
 */
@Module
public class WeatherModule {
    @Provides
    public WeatherService getWeatherService() {
        return new WeatherService();
    }
}
