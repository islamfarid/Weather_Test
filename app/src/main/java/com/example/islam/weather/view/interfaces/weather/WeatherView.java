package com.example.islam.weather.view.interfaces.weather;

import com.example.islam.weather.models.weather.WeatherModel;

/**
 * Created by islam on 03/03/16.
 */
public interface WeatherView {
    public void setWeather(WeatherModel weatherModel);
    public void hideLoading();
    public void showErrorMessage(String errorMessage);
}
