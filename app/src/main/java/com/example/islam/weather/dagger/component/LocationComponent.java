package com.example.islam.weather.dagger.component;

import com.example.islam.weather.dagger.module.LocationModule;
import com.example.islam.weather.service.location.LocationService;

import dagger.Component;

/**
 * Created by islam on 04/03/16.
 */
@Component(modules = {LocationModule.class})
public interface LocationComponent {
    public LocationService getLocationService();
}
