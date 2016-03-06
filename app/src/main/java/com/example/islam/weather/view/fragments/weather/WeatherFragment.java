package com.example.islam.weather.view.fragments.weather;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.islam.weather.R;
import com.example.islam.weather.models.weather.WeatherModel;
import com.example.islam.weather.presenter.weaher.WeatherPresenter;
import com.example.islam.weather.view.interfaces.weather.WeatherView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by islam on 03/03/16.
 */
public class WeatherFragment extends Fragment implements WeatherView {
    @Bind(R.id.loading_progressbar)
    ProgressBar mLoadingProgressBar;
    WeatherPresenter mWeatherPresenter;
    @Bind(R.id.error_message_textview)
    TextView mErrorMessageTextView;
    @Bind(R.id.summary_textview)
    TextView mSummaryTextView;
    @Bind(R.id.weather_icon_imageview)
    ImageView mWeatherIconImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weather, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        mWeatherPresenter = new WeatherPresenter(this);
        mWeatherPresenter.obtainWeatherData(getActivity());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void setWeather(WeatherModel weatherModel) {
        mSummaryTextView.setText(weatherModel.getCurrentlyModel().getSummary());
        mWeatherIconImageView.setImageResource(weatherModel.getCurrentlyModel().getWeatherStatusIconResId());
        mWeatherIconImageView.setImageResource(weatherModel.getCurrentlyModel().getWeatherStatusIconResId());
    }

    @Override
    public void hideLoading() {
        mLoadingProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showErrorMessage(String errorMessage) {
        mErrorMessageTextView.setVisibility(View.VISIBLE);
        mErrorMessageTextView.setText(errorMessage);
    }
}
