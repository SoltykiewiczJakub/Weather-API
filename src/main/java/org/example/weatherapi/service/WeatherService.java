package org.example.weatherapi.service;

import org.example.weatherapi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherResponse getWeather(String city) throws JSONException {
        String url = String.format("%s?q=%s&appid=%s&units=metric", apiUrl, city, apiKey);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        JSONObject json = new JSONObject(response);

        WeatherResponse weather = new WeatherResponse();
        weather.setTemperature(json.getJSONObject("main").getDouble("temp"));
        weather.setPressure(json.getJSONObject("main").getInt("pressure"));
        weather.setDescription(json.getJSONArray("weather").getJSONObject(0).getString("description"));
        weather.setHumidity(json.getJSONObject("main").getInt("humidity"));
        weather.setWindSpeed(json.getJSONObject("wind").getDouble("speed"));
        weather.setCity(json.getString("name"));


        return weather;
    }
}
