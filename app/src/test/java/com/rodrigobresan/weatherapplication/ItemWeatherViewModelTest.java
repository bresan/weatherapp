package com.rodrigobresan.weatherapplication;

import com.rodrigobresan.weatherapplication.model.City;
import com.rodrigobresan.weatherapplication.model.Weather;
import com.rodrigobresan.weatherapplication.model.WeatherDescriptionEnum;
import com.rodrigobresan.weatherapplication.viewmodel.WeatherViewModel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rodrigobresan on 4/27/17.
 * <p>
 * E-mail: rcbresan@gmail.com
 * Github: bresan
 */

public class ItemWeatherViewModelTest {

    private static final String WEATHER_CITY_NAME = "Campinas";
    private static final String WEATHER_DESCRIPTION_HOT_SUNNY = "Hot sunny";
    private static final String WEATHER_DESCRIPTION_HOT_CLOUDY = "Hot cloudy";
    private static final String WEATHER_DESCRIPTION_HOT_RAINY = "Hot rainy";
    private static final float WEATHER_CELSIUS_TEMPERATURE = 0;
    private static final float WEATHER_UMIDITY = 10;

    @Test
    public void shouldGetCityName() {
        Weather weather = new Weather();

        City city = new City();
        city.name = WEATHER_CITY_NAME;

        weather.city = city;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);

        assertEquals(city.name, weatherViewModel.getCityName());
    }

    @Test
    public void shouldGetWeatherForHotSunnyWeather() {
        Weather weather = new Weather();
        weather.weatherDescriptionEnum = WeatherDescriptionEnum.HOT_SUNNY;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);

        assertEquals(WEATHER_DESCRIPTION_HOT_SUNNY, weatherViewModel.getWeatherDescription());
    }

    @Test
    public void shouldGetWeatherForHotCloudyWeather() {
        Weather weather = new Weather();
        weather.weatherDescriptionEnum = WeatherDescriptionEnum.HOT_CLOUDY;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);

        assertEquals(WEATHER_DESCRIPTION_HOT_CLOUDY, weatherViewModel.getWeatherDescription());
    }

    @Test
    public void shouldGetWeatherForHotRainyWeather() {
        Weather weather = new Weather();
        weather.weatherDescriptionEnum = WeatherDescriptionEnum.HOT_RAINY;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);

        assertEquals(WEATHER_DESCRIPTION_HOT_RAINY, weatherViewModel.getWeatherDescription());
    }

    @Test
    public void shouldGetCelsiusTemperature() {
        Weather weather = new Weather();
        weather.celsiusTemperature = 0;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);
        assertEquals(weather.celsiusTemperature, weatherViewModel.getTemperatureInCelsius(), 0);
    }

    @Test
    public void shouldGetFahrenheitTemperature() {
        Weather weather = new Weather();
        weather.celsiusTemperature = 0;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);
        assertEquals(weather.getTemperatureInFahrenheit(), weatherViewModel.getTemperatureInFahrenheint(), 0);
    }

    @Test
    public void shouldGetKelvinTemperature() {
        Weather weather = new Weather();
        weather.celsiusTemperature = 0;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);
        assertEquals(weather.getTemperatureInKelvin(), weatherViewModel.getTemperatureInKelvin(), 0);
    }

    @Test
    public void shouldGetUmidity() {
        Weather weather = new Weather();
        weather.umidity = WEATHER_UMIDITY;

        WeatherViewModel weatherViewModel = new WeatherViewModel(weather);

        assertEquals(weather.umidity, weatherViewModel.getUmidity(), 0);
    }
}
