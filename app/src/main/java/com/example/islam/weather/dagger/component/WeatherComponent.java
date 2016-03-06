package com.example.islam.weather.dagger.component;

import com.example.islam.weather.dagger.module.NetworkModule;
import com.example.islam.weather.dagger.module.WeatherModule;
import com.example.islam.weather.service.location.LocationService;
import com.example.islam.weather.service.weather.WeatherService;

import dagger.Component;

/**
 * Created by islam on 04/03/16.
 */
@Component(modules = {WeatherModule.class})
public interface WeatherComponent {
    public WeatherService getWeatherService();
}
