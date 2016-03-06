package com.example.islam.weather.dagger.component;

import com.example.islam.weather.dagger.module.NetworkModule;
import com.example.islam.weather.network.NetworkManager;
import com.example.islam.weather.service.location.LocationService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by islam on 04/03/16.
 */
@Singleton
@Component(modules = {NetworkModule.class})
public interface NetworkComponent {
    public NetworkManager getNetworkManager();
}
