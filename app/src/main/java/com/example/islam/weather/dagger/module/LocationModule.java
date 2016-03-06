package com.example.islam.weather.dagger.module;

import com.example.islam.weather.service.location.LocationService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by islam on 04/03/16.
 */
@Module
public class LocationModule {
    @Provides
    public LocationService getLocationService() {
        return new LocationService();
    }
}
