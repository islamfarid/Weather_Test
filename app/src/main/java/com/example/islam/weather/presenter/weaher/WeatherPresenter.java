package com.example.islam.weather.presenter.weaher;

import android.content.Context;

import com.example.islam.weather.dagger.component.DaggerWeatherComponent;
import com.example.islam.weather.models.weather.WeatherModel;
import com.example.islam.weather.service.weather.WeatherService;
import com.example.islam.weather.view.interfaces.weather.WeatherView;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by islam on 03/03/16.
 */
public class WeatherPresenter {
    WeatherView weatherView;

    public WeatherPresenter(WeatherView weatherView) {
        this.weatherView = weatherView;
    }

    public void obtainWeatherData(Context context) {
        WeatherService weatherService = DaggerWeatherComponent.create().getWeatherService();
        weatherService.obtainWeather(context).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<WeatherModel>() {
            @Override
            public void onCompleted() {
                weatherView.hideLoading();

            }

            @Override
            public void onError(Throwable e) {
                weatherView.hideLoading();
                weatherView.showErrorMessage(e.getMessage());
            }

            @Override
            public void onNext(WeatherModel weatherModel) {
                weatherView.setWeather(weatherModel);
            }
        });
    }
}
