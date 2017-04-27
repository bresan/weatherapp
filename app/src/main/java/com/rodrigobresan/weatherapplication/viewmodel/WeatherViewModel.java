package com.rodrigobresan.weatherapplication.viewmodel;

import android.databinding.BaseObservable;

import com.rodrigobresan.weatherapplication.model.Weather;

/**
 * Created by rodrigobresan on 4/27/17.
 * <p>
 * E-mail: rcbresan@gmail.com
 * Github: bresan
 */

public class WeatherViewModel extends BaseObservable {

    private Weather weather;

    public WeatherViewModel(Weather weather) {
        this.weather = weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getWeatherDescription() {
        switch (weather.getWeatherDescriptionEnum()) {
            case HOT_SUNNY:
                return "Hot sunny";

            case HOT_CLOUDY:
                return "Hot cloudy";

            case HOT_RAINY:
                return "Hot rainy";

            case WARM_SUNNY:
                return "Warm sunny";

            case WARM_CLOUDY:
                return "Warm cloudy";

            case WARM_RAINY:
                return "Warm rainy";

            case COLD_SUNNY:
                return "Cold sunny";

            case COLD_CLOUDY:
                return "Cold cloudy";

            case COLD_RAINY:
                return "Cold rainy";

            default:
                return "Description unavailable";
        }
    }

    public float getTemperatureInCelsius() {
        return weather.getTemperatureInCelsius();
    }

    public float getTemperatureInFahrenheint() {
        return weather.getTemperatureInFahrenheit();
    }

    public float getTemperatureInKelvin() {
        return weather.getTemperatureInKelvin();
    }

    public String getCityName() {
        return weather.city.name;
    }

    public float getUmidity() {
        return weather.umidity;
    }

}
