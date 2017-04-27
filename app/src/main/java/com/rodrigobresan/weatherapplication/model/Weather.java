package com.rodrigobresan.weatherapplication.model;

/**
 * Created by rodrigobresan on 4/27/17.
 * <p>
 * E-mail: rcbresan@gmail.com
 * Github: bresan
 */

public class Weather {

    /**
     * Why are we using public fields?
     * https://developer.android.com/training/articles/perf-tips.html#GettersSetters
     * But since we are using ProGuard, we don't need to worry about it since it does inline
     * the accessors for us.
     */

    public long id;
    public City city;
    public WeatherDescriptionEnum weatherDescriptionEnum;
    public float celsiusTemperature;
    public float umidity;

    public float getTemperatureInCelsius() {
        return celsiusTemperature;
    }

    public float getTemperatureInFahrenheit() {
        // TODO calculate the temperature in fahrenheit
        return celsiusTemperature;
    }

    public float getTemperatureInKelvin() {
        // TODO calculate the temperature in kelvin
        return celsiusTemperature;
    }

    public WeatherDescriptionEnum getWeatherDescriptionEnum() {
        return weatherDescriptionEnum;
    }


}
