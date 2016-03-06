package com.example.islam.weather.dagger.module;

import com.example.islam.weather.network.NetworkManager;
import com.example.islam.weather.service.location.LocationService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by islam on 04/03/16.
 */
@Module
public class NetworkModule {
    @Singleton
    @Provides
    public NetworkManager getNetworkManager() {
        return new NetworkManager();
    }
}
