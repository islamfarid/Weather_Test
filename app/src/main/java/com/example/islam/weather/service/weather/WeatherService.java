package com.example.islam.weather.service.weather;

import android.content.Context;
import android.location.Location;

import com.example.islam.weather.common.Constants;
import com.example.islam.weather.dagger.component.DaggerLocationComponent;
import com.example.islam.weather.dagger.component.DaggerNetworkComponent;
import com.example.islam.weather.models.weather.WeatherModel;
import com.example.islam.weather.network.NetworkManager;
import com.example.islam.weather.service.location.LocationService;

import javax.inject.Inject;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by islam on 04/03/16.
 */
public class WeatherService {
    Observable<WeatherModel> weatherModelObservable;

    @Inject
    public WeatherService() {

    }

    public Observable<WeatherModel> obtainWeather(Context context) {
        LocationService locationService = DaggerLocationComponent.create().getLocationService();
        return locationService.getLocation(context).flatMap(location -> {
            NetworkManager networkManager = DaggerNetworkComponent.create().getNetworkManager();
            return networkManager.getWeatherData(Constants.API_KEY, location.getLatitude() + "," + location.getLongitude()).map(weatherModel -> {
                int id = context.getResources().getIdentifier(weatherModel.getCurrentlyModel().getIcon().replace("-", "_"), "mipmap", context.getPackageName());
                weatherModel.getCurrentlyModel().setWeatherStatusIconResId(id);
                return weatherModel;
            });
        });
    }


}
